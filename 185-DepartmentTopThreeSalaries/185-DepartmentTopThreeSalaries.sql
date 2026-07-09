-- Last updated: 7/9/2026, 3:05:25 PM
SELECT
    Department,
    Employee,
    Salary
FROM (
    SELECT
        d.name AS Department,
        e.name AS Employee,
        e.salary AS Salary,
        DENSE_RANK() OVER(
            PARTITION BY departmentId
            ORDER BY salary DESC
        ) AS rn
    FROM Employee e
    JOIN Department d
    ON e.departmentId = d.id
) t
WHERE rn <= 3;