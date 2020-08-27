(ns lapwing-chromeos.content-script
  (:require [lapwing-chromeos.content-script.core :as core]
            [chromex.support :refer [runonce]]))

(runonce
  (core/init!))
