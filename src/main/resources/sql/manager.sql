--------------------------------------------------------
--  文件已创建 - 星期五-九月-18-2015   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table MANAGER
--------------------------------------------------------

  CREATE TABLE "SCOTT"."MANAGER" 
   (	"ID" NUMBER(*,0), 
	"NAME" VARCHAR2(20 BYTE), 
	"PASS" VARCHAR2(32 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into SCOTT.MANAGER
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index MANAGER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SCOTT"."MANAGER_PK" ON "SCOTT"."MANAGER" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index MANAGER_UK1
--------------------------------------------------------

  CREATE UNIQUE INDEX "SCOTT"."MANAGER_UK1" ON "SCOTT"."MANAGER" ("NAME") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table MANAGER
--------------------------------------------------------

  ALTER TABLE "SCOTT"."MANAGER" ADD CONSTRAINT "MANAGER_UK1" UNIQUE ("NAME")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "SCOTT"."MANAGER" ADD CONSTRAINT "MANAGER_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "SCOTT"."MANAGER" MODIFY ("PASS" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."MANAGER" MODIFY ("NAME" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."MANAGER" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  DDL for Trigger MANAGER_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "SCOTT"."MANAGER_TRG" BEFORE INSERT ON MANAGER 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT MANAGER_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SCOTT"."MANAGER_TRG" ENABLE;
