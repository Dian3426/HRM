--------------------------------------------------------
--  文件已创建 - 星期日-九月-20-2015   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table TEMPORARY
--------------------------------------------------------

  CREATE TABLE "SCOTT"."TEMPORARY" 
   (	"ID" NUMBER(*,0), 
	"EMP_ID" VARCHAR2(10 BYTE), 
	"JOB_ID" VARCHAR2(10 BYTE), 
	"BEGINTIME" VARCHAR2(20 BYTE), 
	"ENDTIME" VARCHAR2(20 BYTE), 
	"RESULT" NUMBER(*,0), 
	"DEALTIME" VARCHAR2(20 BYTE), 
	"OPE_ID" VARCHAR2(10 BYTE), 
	"EXPLANATION" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into SCOTT.TEMPORARY
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index TEMPORARY_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SCOTT"."TEMPORARY_PK" ON "SCOTT"."TEMPORARY" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table TEMPORARY
--------------------------------------------------------

  ALTER TABLE "SCOTT"."TEMPORARY" ADD CONSTRAINT "TEMPORARY_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "SCOTT"."TEMPORARY" MODIFY ("OPE_ID" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."TEMPORARY" MODIFY ("DEALTIME" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."TEMPORARY" MODIFY ("RESULT" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."TEMPORARY" MODIFY ("ENDTIME" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."TEMPORARY" MODIFY ("BEGINTIME" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."TEMPORARY" MODIFY ("JOB_ID" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."TEMPORARY" MODIFY ("EMP_ID" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."TEMPORARY" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table TEMPORARY
--------------------------------------------------------

  ALTER TABLE "SCOTT"."TEMPORARY" ADD CONSTRAINT "TEMPORARY_SKEMP_FK1" FOREIGN KEY ("EMP_ID")
	  REFERENCES "SCOTT"."SKEMP" ("EMP_ID") ENABLE;
  ALTER TABLE "SCOTT"."TEMPORARY" ADD CONSTRAINT "TEMPORARY_SKEMP_FK2" FOREIGN KEY ("OPE_ID")
	  REFERENCES "SCOTT"."SKEMP" ("EMP_ID") ENABLE;
  ALTER TABLE "SCOTT"."TEMPORARY" ADD CONSTRAINT "TEMPORARY_SKJOB_FK1" FOREIGN KEY ("JOB_ID")
	  REFERENCES "SCOTT"."SKJOB" ("JOB_ID") ENABLE;
--------------------------------------------------------
--  DDL for Trigger TEMPORARY_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "SCOTT"."TEMPORARY_TRG" BEFORE INSERT ON TEMPORARY 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT TEMPORARY_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SCOTT"."TEMPORARY_TRG" ENABLE;
