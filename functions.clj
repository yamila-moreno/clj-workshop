;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.


(defn total-with-tip
  "Adds a tip to the bill"
  [total]
  (* 1.10 total)
)

(defn total-per-capita
  "How much money each person has to pay"
  [total people]
  (/ total people)
)

(total-per-capita (total-with-tip 78) 6)