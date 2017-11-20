-- :name create-recipes-table :!
CREATE TABLE IF NOT EXISTS recipes (
  id bigserial PRIMARY KEY,
  name varchar NOT NULL,
  description text NOT NULL,
  created_at timestamp NOT NULL default current_timestamp
)

-- :name drop-recipes-table :!
DROP TABLE IF EXISTS recipes

-- :name insert-recipe :! :n
INSERT INTO recipes (name, description)
VALUES (:name, :description)

-- :name recipe-by-name-like :? :1
SELECT * FROM recipes WHERE name LIKE :name-like

-- :name recipes-with-cols :? :*
SELECT :i*:cols FROM recipes
