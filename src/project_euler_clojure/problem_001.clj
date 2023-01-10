;; Problem 1

;; If we list all the natural numbers below 10 that are multiples of 3 or 5,
;; we get 3, 5, 6 and 9. The sum of these multiples is 23.

;; Find the sum of all the multiples of 3 or 5 below 1000.

(ns project-euler-clojure.problem-001)

(defn divisible-by-3-or-5?
  [n]
  (or (zero? (mod n 3))
      (zero? (mod n 5))))

(defn solution-001
  []
  (->>
   (range 1000)
   (filter divisible-by-3-or-5?)
   (reduce +)))

(solution-001)
