
(defn average
  "Returns the average of several bill amounts"
  [bill-amounts]
  (/ (reduce + bill-amounts) (count bill-amounts))
)

(average [4 2 4])
(average [4 2 6 7 8 9])
