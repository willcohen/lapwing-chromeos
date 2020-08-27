(ns lapwing-chromeos.background
  (:require [lapwing-chromeos.background.core :as core]
            [chromex.support :refer [runonce]]))

(runonce
  (core/init!))
