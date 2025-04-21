# Write your MySQL query statement below
select q.query_name, round(sum(q.rating / q.position) / count(*), 2) as quality, ROUND(SUM(CASE WHEN rating < 3 THEN 1 ELSE 0 END) * 100.0 / COUNT(*), 2) AS poor_query_percentage
from Queries q
group by query_name