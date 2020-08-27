(ns lapwing-chromeos.popup
  (:require [lapwing-chromeos.popup.core :as core]
            [chromex.support :refer [runonce]]))

(runonce
  (core/init!))
