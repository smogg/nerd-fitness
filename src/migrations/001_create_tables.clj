(ns migrations.001-create-tables
  (:require [nerd-recipes.db :as db]
            [nerd-recipes.db.recipes :as db-recipes]))

(defn up
  []
  (db-recipes/create-recipes-table db/spec))

(defn down
  []
  (db-recipes/drop-recipes-table db/spec))
