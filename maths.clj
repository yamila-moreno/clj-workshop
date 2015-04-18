;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(/ 164 2.54)
(/ (/ 164 2.54) 12)
(* 0.380 12)

;; 5 feet 4 inches
;; 2.54 cms == 1 inch
;; 1 foot == 12 inches

(def feet 5)
(def inches 4)

(def feet_in_inches (* feet 12))
(def yami (* (+ feet_in_inches inches) 2.54))

(def rosa 160)
(def natalia 163)

(def averagecms (/ (+ yami natalia rosa) 3))
(def average_inches (/ averagecms 2.54))


(def average_cms_in_feet (quot averaget_inches 12))
(def average_cms_in_inches (mod average_inches 12))

