--------------------------------------------------------
--  文件已创建 - 星期日-九月-20-2015   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table TALENT
--------------------------------------------------------

  CREATE TABLE "SCOTT"."TALENT" 
   (	"ID" NUMBER(*,0), 
	"EMP_ID" VARCHAR2(10 BYTE), 
	"JOB_ID" VARCHAR2(10 BYTE), 
	"STATUS" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into SCOTT.TALENT
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index TALENT_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SCOTT"."TALENT_PK" ON "SCOTT"."TALENT" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table TALENT
--------------------------------------------------------

  ALTER TABLE "SCOTT"."TALENT" ADD CONSTRAINT "TALENT_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "SCOTT"."TALENT" MODIFY ("STATUS" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."TALENT" MODIFY ("JOB_ID" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."TALENT" MODIFY ("EMP_ID" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."TALENT" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table TALENT
--------------------------------------------------------

  ALTER TABLE "SCOTT"."TALENT" ADD CONSTRAINT "TALENT_SKEMP_FK1" FOREIGN KEY ("EMP_ID")
	  REFERENCES "SCOTT"."SKEMP" ("EMP_ID") ENABLE;
  ALTER TABLE "SCOTT"."TALENT" ADD CONSTRAINT "TALENT_SKJOB_FK1" FOREIGN KEY ("JOB_ID")
	  REFERENCES "SCOTT"."SKJOB" ("JOB_ID") ENABLE;
--------------------------------------------------------
--  DDL for Trigger TALENT_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "SCOTT"."TALENT_TRG" BEFORE INSERT ON TALENT 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT TALENT_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SCOTT"."TALENT_TRG" ENABLE;
