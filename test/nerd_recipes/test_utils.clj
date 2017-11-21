(ns nerd-recipes.test-utils
  (:require [nerd-recipes.db :as db]
            [drift.core :as drift]
            [drift.runner :as runner]))

(def test-db-spec
  {:subprotocol "postgresql"
   :subname "//localhost:5432/nerd_recipes_test"
   :user "test_user"
   :password ""})

(defn test-db-fixture
  [tests]
  (with-redefs [nerd-recipes.db/spec test-db-spec]
    (drift/run-init nil)
    (runner/migrate-up-all)
    (try
      (tests)
      (finally
        (runner/migrate-down-all)))))
