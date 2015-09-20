--------------------------------------------------------
--  文件已创建 - 星期日-九月-20-2015   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table SKSTAFF
--------------------------------------------------------

  CREATE TABLE "SCOTT"."SKSTAFF" 
   (	"ID" NUMBER(*,0), 
	"EMP_ID" VARCHAR2(10 BYTE), 
	"JOB_ID" VARCHAR2(10 BYTE), 
	"TIME" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into SCOTT.SKSTAFF
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index SKSTAFF_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SCOTT"."SKSTAFF_PK" ON "SCOTT"."SKSTAFF" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table SKSTAFF
--------------------------------------------------------

  ALTER TABLE "SCOTT"."SKSTAFF" ADD CONSTRAINT "SKSTAFF_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "SCOTT"."SKSTAFF" MODIFY ("TIME" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."SKSTAFF" MODIFY ("JOB_ID" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."SKSTAFF" MODIFY ("EMP_ID" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."SKSTAFF" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table SKSTAFF
--------------------------------------------------------

  ALTER TABLE "SCOTT"."SKSTAFF" ADD CONSTRAINT "SKSTAFF_SKEMP_FK1" FOREIGN KEY ("EMP_ID")
	  REFERENCES "SCOTT"."SKEMP" ("EMP_ID") ENABLE;
  ALTER TABLE "SCOTT"."SKSTAFF" ADD CONSTRAINT "SKSTAFF_SKJOB_FK1" FOREIGN KEY ("JOB_ID")
	  REFERENCES "SCOTT"."SKJOB" ("JOB_ID") ENABLE;
--------------------------------------------------------
--  DDL for Trigger SKSTAFF_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "SCOTT"."SKSTAFF_TRG" BEFORE INSERT ON SKSTAFF 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT SKSTAFF_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SCOTT"."SKSTAFF_TRG" ENABLE;
