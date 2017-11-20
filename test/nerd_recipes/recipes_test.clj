(ns nerd-recipes.recipes-test
 (:require [clojure.test :refer :all]
           [nerd-recipes.test-utils :as tu]
           [nerd-recipes.recipes :as recipes]))

(use-fixtures :once tu/test-db-fixture)

(deftest recipes-test
  (testing "Adding/getting recipes"
    (recipes/add-recipe "Pierogi" "Polish pierogies are the best")
    (recipes/add-recipe "Kiełbasa" "Nothing like polish sausage")
    (let [{:keys [id name description]} (recipes/get-recipe "Pierogi")]
      (is (= id 1))
      (is (= name "Pierogi"))
      (is (= description "Polish pierogies are the best"))))
  (testing "Getting all recipes"
    (is (= (recipes/get-recipes)
           [{:name "Pierogi" :description "Polish pierogies are the best"}
            {:name "Kiełbasa" :description "Nothing like polish sausage"}]))
    (is (= (recipes/get-recipes [:name])
           [{:name "Pierogi"}
            {:name "Kiełbasa"}]))))
