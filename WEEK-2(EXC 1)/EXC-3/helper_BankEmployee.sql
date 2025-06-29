CLEAR SCREEN 
SET SERVEROUTPUT ON
DECLARE
	P NUMBER;
	D VARCHAR2(20);
BEGIN
	P:=&Percentage;
	D:='&Department';
	UpdateEmployeeBonus(P,D);
END;