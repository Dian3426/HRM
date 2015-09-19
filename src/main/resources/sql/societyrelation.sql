--------------------------------------------------------
--  文件已创建 - 星期日-九月-20-2015   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table SOCIETYRELATION
--------------------------------------------------------

  CREATE TABLE "SCOTT"."SOCIETYRELATION" 
   (	"ID" NUMBER(*,0), 
	"RELATION" VARCHAR2(20 BYTE), 
	"NAME" VARCHAR2(20 BYTE), 
	"JOB" VARCHAR2(20 BYTE), 
	"POSI" VARCHAR2(20 BYTE), 
	"TEL" VARCHAR2(20 BYTE), 
	"EMP_ID" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into SCOTT.SOCIETYRELATION
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index SOCIETYRELATION_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SCOTT"."SOCIETYRELATION_PK" ON "SCOTT"."SOCIETYRELATION" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table SOCIETYRELATION
--------------------------------------------------------

  ALTER TABLE "SCOTT"."SOCIETYRELATION" ADD CONSTRAINT "SOCIETYRELATION_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "SCOTT"."SOCIETYRELATION" MODIFY ("EMP_ID" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."SOCIETYRELATION" MODIFY ("TEL" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."SOCIETYRELATION" MODIFY ("NAME" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."SOCIETYRELATION" MODIFY ("RELATION" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."SOCIETYRELATION" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table SOCIETYRELATION
--------------------------------------------------------

  ALTER TABLE "SCOTT"."SOCIETYRELATION" ADD CONSTRAINT "SOCIETYRELATION_SKEMP_FK1" FOREIGN KEY ("EMP_ID")
	  REFERENCES "SCOTT"."SKEMP" ("EMP_ID") ENABLE;
--------------------------------------------------------
--  DDL for Trigger SOCIETYRELATION_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "SCOTT"."SOCIETYRELATION_TRG" BEFORE INSERT ON SOCIETYRELATION 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT SOCIETYRELATION_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SCOTT"."SOCIETYRELATION_TRG" ENABLE;
