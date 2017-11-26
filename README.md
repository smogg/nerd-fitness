# nerd-recipes

This project is based on a set tutorial articles found on www.bowlofcode.com

Articles:
1. http://bowlofcode.com/building-a-clojure-web-app-backed-by-postgres

## Prerequisites

With Postgres correctly setup and running create a development database/user using default `postgres` user:

```
$ psql -U postgres -f dev/inti_dev_db.sql
```

To run the tests, you'll need to run yet another script:

```
$ psql -U postgres -f dev/inti_test_db.sql
```

To migrate the database run `lein migrate`.


## Running

To start a web server for the application, run:

    lein ring server

## License

Copyright © 2017 Smogg
