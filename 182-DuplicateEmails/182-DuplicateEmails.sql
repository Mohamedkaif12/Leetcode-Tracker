-- Last updated: 7/9/2026, 3:05:30 PM
SELECT email
FROM Person
GROUP BY email
HAVING COUNT(*) > 1;