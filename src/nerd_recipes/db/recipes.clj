(ns nerd-recipes.db.recipes
  (:require [hugsql.core :as hugsql]))

(hugsql/def-db-fns "nerd_recipes/db/sql/recipes.sql")
