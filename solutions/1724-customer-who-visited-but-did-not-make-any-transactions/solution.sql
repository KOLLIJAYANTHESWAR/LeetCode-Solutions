# Write your MySQL query statement below
select v.customer_id,
    COUNT(*) AS count_no_trans
from Visits v
Left join Transactions t
on t.visit_id = v.visit_id
where t.transaction_id is NULL
group by v.customer_id
order by count_no_trans desc;
