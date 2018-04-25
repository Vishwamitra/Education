<h1> What is BSN? </h1>
BSN is short form of Dutch Word – BurgerServiceNummer . In English, this is called  Citizen Service Number. This is a unique Personal Identification Number assigned by Netherlands Govt. This was introduced since 2007. To know more about this you can read this wiki page or you can refer the NL government website about it. This is a 9 digit number which should corresponds to 11-check or in dutch Elfproef


<h1> What is Elfproef or 11-Check – Specific to BSN </h1>
A variant of standard Elfproef, is used for BSN. There is small change in the standard. Weighted value for the last digit from Left to Right is changed from 1 to -1 . That’s all the deviation from the standard 11-Check.
Example:

Check if 614961122 is a valid 11-check number
Total sum = 6 * 9 + 1*8 + 4*7 + 9 *6 + 6*5 + 1*4 + 1*3 + 2*2 + 2*(-1) = 183
Check if Total sum is divisible by 11 => 183 / 11 = 17 ( Remainder = 7)
This means 614961122 is not a VALID BSN Number of Netherlands

To do this validation easily in Excel, I created a Excel VBA function using above Algorithm, to validate if a given number is a valid BSN number of Netherlands or not.
Note: With validity, I do not mean, if this is a real existing BSN number or not, but whether that number qualifies the Elfproef or 11-check.