(ns project-euler-clojure.commons.core)

(defn factor?
  [number factor]
  (zero? (rem number factor)))

(defn factors
  [number]
  (filter #(factor? number %) (range 1 (inc number))))

(defn prime?
  [number]
  (->> (range 2 (inc (/ number 2)))
       (not-any? #(factor? number %))))
