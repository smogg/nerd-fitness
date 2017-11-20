(ns nerd-recipes.recipes
  (:require [nerd-recipes.db.recipes :as db-recipes]
            [nerd-recipes.db :as db]))

(defn add-recipe
  [name description]
  (db-recipes/insert-recipe db/spec {:name name :description description}))

(defn get-recipe
  [name]
  (db-recipes/recipe-by-name-like db/spec {:name-like name}))

(defn get-recipes
  ([]
   (get-recipes ["name" "description"]))
  ([cols]
   (db-recipes/recipes-with-cols db/spec {:cols (map name cols)})))
