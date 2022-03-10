Try:

```
bin/kaocha suite-a
bin/kaocha --focus suite-a
```

Config:

```
% bin/kaocha --print-config
{:kaocha/tests
 [{:kaocha.testable/id :suite-a,
   :kaocha.testable/type :kaocha.type/clojure.test,
   :kaocha/ns-patterns ["-test$"],
   :kaocha/source-paths ["suite-a/src"],
   :kaocha/test-paths ["suite-a/test"]}
  {:kaocha.testable/id :suite-b,
   :kaocha.testable/type :kaocha.type/clojure.test,
   :kaocha/ns-patterns ["-test$"],
   :kaocha/source-paths ["suite-b/src"],
   :kaocha/test-paths ["suite-b/test"]}],
 :kaocha/fail-fast? false,
 :kaocha/color? true,
 :kaocha/cli-options {:config-file "tests.edn", :print-config true},
 :kaocha.plugin.randomize/seed 716010007,
 :kaocha.plugin.randomize/randomize? true,
 :kaocha/plugins
 [:kaocha.plugin/randomize
  :kaocha.plugin/filter
  :kaocha.plugin/capture-output
  :repro/plugin],
 :kaocha.plugin.capture-output/capture-output? true,
 :kaocha/reporter [kaocha.report/dots]}
```

Test plan:

```
% bin/kaocha suite-a --print-test-plan
{:kaocha.test-plan/tests
 ({:kaocha.test-plan/tests
   ({:kaocha.testable/type :kaocha.type/ns,
     :kaocha.testable/id :suite-b.my-test,
     :kaocha.testable/desc "suite-b.my-test",
     :kaocha.ns/name suite-b.my-test,
     :kaocha.testable/meta nil,
     :kaocha.ns/ns
     #object[clojure.lang.Namespace 0x1ab1d93d "suite-b.my-test"],
     :kaocha.test-plan/tests
     ({:kaocha.var/test
       #object[suite_b.my_test$fn__4917 0x10d49900 "suite_b.my_test$fn__4917@10d49900"],
       :kaocha.plugin.randomize/sort-key -1211185842,
       :kaocha.testable/meta
       {:test
        #object[suite_b.my_test$fn__4917 0x10d49900 "suite_b.my_test$fn__4917@10d49900"],
        :line 4,
        :column 1,
        :file "suite_b/my_test.clj",
        :name dummy-test,
        :ns
        #object[clojure.lang.Namespace 0x1ab1d93d "suite-b.my-test"]},
       :kaocha.testable/type :kaocha.type/var,
       :kaocha.var/name suite-b.my-test/dummy-test,
       :kaocha.var/var #'suite-b.my-test/dummy-test,
       :kaocha.testable/desc "dummy-test",
       :kaocha.testable/wrap [],
       :kaocha.testable/id :suite-b.my-test/dummy-test}),
     :kaocha.plugin.randomize/sort-key -456333391}),
   :kaocha.plugin.randomize/sort-key -2005681821,
   :kaocha/test-paths ["suite-b/test"],
   :kaocha/ns-patterns ["-test$"],
   :kaocha.testable/type :kaocha.type/clojure.test,
   :kaocha/source-paths ["suite-b/src"],
   :kaocha.testable/desc "suite-b (clojure.test)",
   :kaocha.testable/id :suite-b}
  {:kaocha.test-plan/tests
   ({:kaocha.testable/type :kaocha.type/ns,
     :kaocha.testable/id :suite-a.my-test,
     :kaocha.testable/desc "suite-a.my-test",
     :kaocha.ns/name suite-a.my-test,
     :kaocha.testable/meta nil,
     :kaocha.ns/ns
     #object[clojure.lang.Namespace 0x24cbf894 "suite-a.my-test"],
     :kaocha.test-plan/tests
     ({:kaocha.var/test
       #object[suite_a.my_test$fn__4902 0x6abb44cb "suite_a.my_test$fn__4902@6abb44cb"],
       :kaocha.plugin.randomize/sort-key 6323707,
       :kaocha.testable/meta
       {:test
        #object[suite_a.my_test$fn__4902 0x6abb44cb "suite_a.my_test$fn__4902@6abb44cb"],
        :line 4,
        :column 1,
        :file "suite_a/my_test.clj",
        :name dummy-test,
        :ns
        #object[clojure.lang.Namespace 0x24cbf894 "suite-a.my-test"]},
       :kaocha.testable/type :kaocha.type/var,
       :kaocha.var/name suite-a.my-test/dummy-test,
       :kaocha.var/var #'suite-a.my-test/dummy-test,
       :kaocha.testable/desc "dummy-test",
       :kaocha.testable/wrap [],
       :kaocha.testable/id :suite-a.my-test/dummy-test}),
     :kaocha.plugin.randomize/sort-key -266498986}),
   :kaocha.plugin.randomize/sort-key 1562315762,
   :kaocha/test-paths ["suite-a/test"],
   :kaocha/ns-patterns ["-test$"],
   :kaocha.testable/type :kaocha.type/clojure.test,
   :kaocha/source-paths ["suite-a/src"],
   :kaocha.testable/desc "suite-a (clojure.test)",
   :kaocha.testable/id :suite-a}),
 :kaocha/fail-fast? false,
 :kaocha.filter/focus-meta #{},
 :kaocha/color? true,
 :kaocha/cli-options {:config-file "tests.edn", :print-test-plan true},
 :kaocha.plugin.randomize/seed 1340140656,
 :kaocha.plugin.randomize/randomize? true,
 :kaocha/plugins
 [:kaocha.plugin/randomize
  :kaocha.plugin/filter
  :kaocha.plugin/capture-output
  :repro/plugin],
 :kaocha.plugin.capture-output/capture-output? true,
 :kaocha/reporter [kaocha.report/dots],
 :kaocha/cli-args (:suite-a)}
 ```
