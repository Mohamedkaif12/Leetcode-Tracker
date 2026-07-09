-- Last updated: 7/9/2026, 3:05:42 PM
SELECT  
      firstName,
      lastName,
      city,
      state
FROM Person 
LEFT JOIN Address
ON Person.personId = Address.personId