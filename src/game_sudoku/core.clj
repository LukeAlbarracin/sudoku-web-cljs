(ns game-sudoku.core
  (:gen-class))

(def sudoku-grid 
  (atom
    [5 3 0 0 7 0 0 0 0
     6 0 0 1 9 5 0 0 0
     8 0 0 0 6 0 0 0 3
     4 0 0 8 0 3 0 0 1
     7 0 0 0 2 0 0 0 6
     0 6 0 0 0 0 2 8 0
     0 0 0 4 1 9 0 0 5
     0 0 0 0 8 0 0 7 9]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (@sudoku-grid)))

(defn check-square [grid x y testval] ;; CHECKS A SINGLE SQUARE
  ;; NEED TO GET SPECFIIC COORDINATE, GET THE VALUE AT GIVEN COORDINATE, GET TRUE OR FALSE IF IT PASSES THE TESTS
  ;; TRANSFORM THIS INTO A VECTOR ADDED TO A MORE DETAILED GRID THAT CALCULATES PROBABILITY
)

(defn check-grid [grid] ;; CHECKS THE WHOLE GRID
  ;; NEEDS A "CYCLE" AND/OR NEXT -> SHOULD LATER FIND THE SQUARE THAT MUST CERTAINLY BE A PARTICULAR NUMBER
  ;; REPEAT THIS PROCESS
)  
  
(defn horizontal? [grid testval y]]
  (contains? (nth (partition 9 grid) y) testval))

(defn vertical? [grid testval x]]
  (contains? (nth (apply mapv vector (partition 9 grid)) x) testval))
  
(defn square? [grid testval sq-coordinate] 
    (as-> grid $
      (partition 9 $)
      (map #(partition 3 %) $)
      (apply mapv vector $)
      (flatten $)
      (partition 9 $) 
      (nth $ sq-coordinate)
      (contains? $ testval)))