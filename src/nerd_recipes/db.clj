(ns nerd-recipes.db
 (:require [jdbc.pool.c3p0 :as pool]))

(def spec
  (pool/make-datasource-spec
    {:subprotocol "postgresql"
     :subname "//localhost:5432/nerd_recipes"
     :user "admin"
     :password ""}))
