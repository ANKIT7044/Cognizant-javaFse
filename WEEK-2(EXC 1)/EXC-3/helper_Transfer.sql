CLEAR SCREEN 
SET SERVEROUTPUT ON
DECLARE
	S_ID NUMBER;
	R_ID NUMBER;
	AMT  NUMBER;


BEGIN
	S_ID:=&SenderAccountID;
	R_ID:=&RecieverAccountID;
	AMT:=&AMOUNT;
	TransferFunds(S_ID,R_ID,AMT);
	DBMS_OUTPUT.PUT_LINE('Transfer completed successfully.');
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error: ' || SQLERRM);
END;
/