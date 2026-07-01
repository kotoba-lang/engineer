(ns engineer-test
  (:require [clojure.test :refer [deftest is testing]]
            [engineer]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? engineer))))
