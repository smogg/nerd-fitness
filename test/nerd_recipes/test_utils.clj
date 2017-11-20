(ns nerd-recipes.test-utils
 (:require [nerd-recipes.db :as db]
           [migrations.001-create-tables :as create-tables]))

(def test-db-spec
   {:subprotocol "postgresql"
    :subname "//localhost:5432/nerd_recipes_test"
    :user "test_user"
    :password ""})

(defn test-db-fixture
 [tests]
 (with-redefs [nerd-recipes.db/spec test-db-spec]
   (create-tables/up)
   (try
     (tests)
     (finally
       (create-tables/down)))))
