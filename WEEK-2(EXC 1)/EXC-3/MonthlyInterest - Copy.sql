CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
	UPDATE Account set balance=1.01*balance where type='savings';
	commit;
	DBMS_OUTPUT.PUT_LINE('Monthly interest increased by 1% for all savings account holder');
EXCEPTION
	WHEN OTHERS THEN
		ROLLBACK;
		DBMS_OUTPUT.PUT_LINE('Error while updating the interest');
END;
/
