"this is a string
which ends here"

(def my-string "this a string
    which has severel á ñ")

(println my-string)

(== 1 2)

;;;;;;;;;;;;;; EXERCISES

(def my-hometown "Pamplona")

(defn format-name
  [first last]
  (str last ", " first)
)

(format-name "Yamila" "Moreno")

(get {:name "yami"} :last :miss)

;;;;;;;;;;;;;;;;;;;;;;;;;;;

(def myself {
  :first "Yami"
  :last "Moreno"
})

(assoc myself :hometown "Pamplona")
(merge myself {:hometown "Pamplona"})

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;,


(defn get-names
  ""
  [women]
  (into [] (map
           (fn [w] (str (:first w) " " (:last w)))
           women
)))


(def women [
  {:first "Ada" :last "Lovelace"}
  {:first "Marie" :middle "Anne" :last "Courie"}
  ;{:first "Lady" :middle "Yamila" :last "Moreno"}
])


(get-names women)

;;;;;;;;;;;

women

(conj {} [:key :value])

(conj women myself)
;;;;;;; diferente de
(conj myself women)


;;;;;;;;;;;;;;;;;;;


(defn format-name
  [x]
  (if (:middle x)
      (str (:first x) " " (:middle x) " " (:last x))
      (str (:first x) " " (:last x))
))

(map format-name women)


(defn format-name-with-order
  ""
  [x order]
  (if (= order :last)
     (str (:last x) " " (:first x) " " (:middle x ""))
     (str (:first x) " " (:middle x "") " " (:last x))
))

(format-name-with-order myself :last)
(format-name-with-order myself nil)

(defn format-names-with-order
  [women order]
  (map (fn [x] (format-name-with-order x order))
       women)
)

(format-names-with-order women :last)
(format-names-with-order women nil)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(and 1 1)
(and 2 3)
(and 3 2)
(and nil 1)
(and nil false)
(and false nil)
(not 1)
(not false)

;;;;;;;;;;;;;;;;;

(defn compare-things
  [a b]
  (
  let [
      aa (* a 2)
      bb (* b 2)
       ]
   (max aa bb)
  )
)

(compare-things 1 2)
(compare-things 3 2)


;;;;;;



(defn average
  "Returns the average of several bill amounts"
  [x]
  (let [total (reduce + x)
        c (count x)]
   (/ total c)
  )
)

(average [4 2 4])
(average [4 2 6 7 8 9])


;;;;;;;;

(rem 21 10)
(rem 221 10)
(rem 1 10)

(rem 221 -100)
(mod 221 -100)


(defn ordinal
  [x]
  (let [xx (rem x 10)]
   (cond
    (= x 11) "11th"
    (= x 12) "12th"
    (= x 13) "13th"
    (= xx 1) (str x "st")
    (= xx 2) (str x "nd")
    (= xx 3) (str x "rd")
    :else (str x "th")
  ))
)

(ordinal 1)
(ordinal 2)
(ordinal 11)













