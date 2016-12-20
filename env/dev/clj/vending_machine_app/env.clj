(ns vending-machine-app.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [vending-machine-app.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[vending_machine_app started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[vending_machine_app has shut down successfully]=-"))
   :middleware wrap-dev})
