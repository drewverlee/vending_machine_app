(ns vending-machine-app.app
  (:require [vending-machine-app.core :as core]))

;;ignore println statements in prod
(set! *print-fn* (fn [& _]))

(core/init!)
