(ns repro.plugin
  (:require [kaocha.plugin :as p]))

(p/defplugin repro/plugin
  (config [config]
    (update config
            :kaocha/tests
            (fnil conj [])
            {:kaocha.testable/id :suite-a
             :kaocha.testable/type :kaocha.type/clojure.test
             :kaocha/ns-patterns ["-test$"]
             :kaocha/source-paths ["suite-a/src"]
             :kaocha/test-paths ["suite-a/test"]}
            {:kaocha.testable/id :suite-b
             :kaocha.testable/type :kaocha.type/clojure.test
             :kaocha/ns-patterns ["-test$"]
             :kaocha/source-paths ["suite-b/src"]
             :kaocha/test-paths ["suite-b/test"]})))
           
