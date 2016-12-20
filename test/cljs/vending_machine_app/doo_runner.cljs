(ns vending-machine-app.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [vending-machine-app.core-test]))

(doo-tests 'vending-machine-app.core-test)

