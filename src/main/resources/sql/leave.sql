--------------------------------------------------------
--  文件已创建 - 星期日-九月-20-2015   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table LEAVE
--------------------------------------------------------

  CREATE TABLE "SCOTT"."LEAVE" 
   (	"ID" NUMBER(*,0), 
	"EMP_ID" VARCHAR2(10 BYTE), 
	"JOB_ID" VARCHAR2(10 BYTE), 
	"PLACE" VARCHAR2(20 BYTE), 
	"TIME" VARCHAR2(20 BYTE), 
	"REASON" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
REM INSERTING into SCOTT.LEAVE
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index LEAVE_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "SCOTT"."LEAVE_PK" ON "SCOTT"."LEAVE" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table LEAVE
--------------------------------------------------------

  ALTER TABLE "SCOTT"."LEAVE" ADD CONSTRAINT "LEAVE_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "SCOTT"."LEAVE" MODIFY ("REASON" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."LEAVE" MODIFY ("TIME" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."LEAVE" MODIFY ("PLACE" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."LEAVE" MODIFY ("JOB_ID" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."LEAVE" MODIFY ("EMP_ID" NOT NULL ENABLE);
  ALTER TABLE "SCOTT"."LEAVE" MODIFY ("ID" NOT NULL ENABLE);
--------------------------------------------------------
--  Ref Constraints for Table LEAVE
--------------------------------------------------------

  ALTER TABLE "SCOTT"."LEAVE" ADD CONSTRAINT "LEAVE_SKEMP_FK1" FOREIGN KEY ("EMP_ID")
	  REFERENCES "SCOTT"."SKEMP" ("EMP_ID") ENABLE;
  ALTER TABLE "SCOTT"."LEAVE" ADD CONSTRAINT "LEAVE_SKJOB_FK1" FOREIGN KEY ("JOB_ID")
	  REFERENCES "SCOTT"."SKJOB" ("JOB_ID") ENABLE;
--------------------------------------------------------
--  DDL for Trigger LEAVE_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "SCOTT"."LEAVE_TRG" BEFORE INSERT ON LEAVE 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF :NEW.ID IS NULL THEN
      SELECT LEAVE_SEQ.NEXTVAL INTO :NEW.ID FROM DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "SCOTT"."LEAVE_TRG" ENABLE;
