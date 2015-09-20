--------------------------------------------------------
--  文件已创建 - 星期日-九月-20-2015   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table CHANGE
--------------------------------------------------------

  CREATE TABLE "SCOTT"."CHANGE" 
   (	"ID" NUMBER(*,0), 
	"EMP_ID" VARCHAR2(10 BYTE), 
	"OLDDEPT" VARCHAR2(20 BYTE), 
	"NEWDEPT" VARCHAR2(20 BYTE), 
	"CHANGREASON" VARCHAR2(20 BYTE), 
	"OLDJOB" VARCHAR2(20 BYTE), 
	"NEWJOB" VARCHAR2(20 BYTE), 
	"TYPE" VARCHAR2(20 BYTE), 
	"CHANGTIME" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into SCOTT.CHANGE
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index CHANGE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SCOTT"."CHANGE_PK" ON "SCOTT"."CHANGE" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table CHANGE
--------------------------------------------------------

  ALTER TABLE "SCOTT"."CHANGE" ADD CONSTRAINT "CHANGE_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "SCOTT"."CHANGE" MODIFY ("CHANGTIME" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."CHANGE" MODIFY ("TYPE" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."CHANGE" MODIFY ("NEWJOB" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."CHANGE" MODIFY ("OLDJOB" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."CHANGE" MODIFY ("CHANGREASON" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."CHANGE" MODIFY ("NEWDEPT" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."CHANGE" MODIFY ("OLDDEPT" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."CHANGE" MODIFY ("EMP_ID" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."CHANGE" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table CHANGE
--------------------------------------------------------

  ALTER TABLE "SCOTT"."CHANGE" ADD CONSTRAINT "CHANGE_SKEMP_FK1" FOREIGN KEY ("EMP_ID")
	  REFERENCES "SCOTT"."SKEMP" ("EMP_ID") ENABLE;
--------------------------------------------------------
--  DDL for Trigger CHANGE_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "SCOTT"."CHANGE_TRG" BEFORE INSERT ON CHANGE 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT CHANGE_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SCOTT"."CHANGE_TRG" ENABLE;
