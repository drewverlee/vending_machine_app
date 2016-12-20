(ns vending-machine-app.handler
  (:require [compojure.core :refer [routes wrap-routes]]
            [vending-machine-app.layout :refer [error-page]]
            [vending-machine-app.routes.home :refer [home-routes]]
            [compojure.route :as route]
            [vending-machine-app.env :refer [defaults]]
            [mount.core :as mount]
            [vending-machine-app.middleware :as middleware]))

(mount/defstate init-app
                :start ((or (:init defaults) identity))
                :stop  ((or (:stop defaults) identity)))

(def app-routes
  (routes
    (-> #'home-routes
        (wrap-routes middleware/wrap-csrf)
        (wrap-routes middleware/wrap-formats))
    (route/not-found
      (:body
        (error-page {:status 404
                     :title "page not found"})))))


(defn app [] (middleware/wrap-base #'app-routes))
