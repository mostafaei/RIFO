
# RIFO: Analysis and performance evaluation (Simulation)

## How to build and run RIFO

#### 1. Software dependencies

* **Java 8:** Version 8 of Java; both Oracle JDK and OpenJDK are supported and produce under that same seed deterministic results. Additionally the project uses the **Apache Maven** software project management and comprehension tool (version 3+).

* **Python 3:** Recent version of Python 3 for analysis; be sure you can globally run `python3 <script.py>`. Packge required: matplotlib. You can install them via pip.

#### 2. Building

Build the executable `NetBench.jar` by using the following maven command:
```
mvn clean compile assembly:single
```

#### 3. Running

1. You can execute a demo run by using the following command:
    ```
    java -jar -ea NetBench.jar x
    ``` 
   where `x` is the index of figure in the paper (i.e. 7, 8, 9, 10, 11, 12, 13, 14, or 0) (e.g., `java -jar -ea NetBench.jar 7` runs simulations for Figure 7). You can run all experiments together sequentially by seeting `x` to 0.
   **Please do not open multiple terminals and run multiple figures concurrently, since the `temp` file paths can be overlapping. Additionally, make sure that you have enough disk space to run all experiments since depending on the number of experiments, the temp directory grows.**

2. After running the experiments, the log files are saved in the `./temp/rifo/rifo_evaluation` folder

3. If you have python 3 installed, you can view calculated statistics about flow completion and port utilization (e.g. mean FCT, 99th %-tile port utilization, ....) in the `./temp/rifo/.../analysis` folder

4. The plotable statistics will be stored in the `./projects/rifo/plots` folder after running the experiments.

5. We provide a script within each directory to plot the figures of the paper in `pdf` format.

#### 4. Example

Let's now go for an example, wanting to reproduce the experiments required to reproduce Figure 7: Simulation results of web search workload to minimize FCT.

1. Build the executable `NetBench.jar` by using the following maven command in the directory you have the code: `mvn clean compile assembly:single`

2. Execute those simulations by using the following command: `java -jar -ea NetBench.jar 8`. This command is to invoke the main method of `./src/main/java/ch.ethz.systems.netbench/core/run/MainFigure8.java`

3. Look into folder `temp/rifo/` to find the raw log files for this simulations run.

4. Look into folder `projects/rifo/plots/rifo_evaluation/pFabric/data_mining_workload`, which  contains the analysis of those log files and data for generating the plots.

5. We provide a script `fig-FCT-dm.py` to generate three figures for the performance of algorithms on data_mining workload.


#### 5. Running time

The running time of the experiments depends on the machine you use and can vary a lot for each run.

## Software structure

There are three sub-packages in [*netbench*](https://github.com/nsg-ethz/sp-pifo): (a) core, containing core functionality, (b) ext (extension), which contains functionality implemented and quite thoroughly tested, and (c) xpt (experimental), which contains functionality not yet as thoroughly tested but reasonably vetted and assumed to be correct for the usecase it was written for.

The framework is written based on five core components:
1. **Network device**: abstraction of a node, can be a server (has a transport layer) or merely function as switch (no transport layer);
2. **Transport layer**: maintains the sockets for each of the flows that are started at the network device and for which it is the destination;
3. **Intermediary**: placed between the network device and transport layer, is able to modify each packet before arriving at the transport layer and after leaving the transport layer;
4. **Link**: quantifies the capabilities of the physical link, which the output port respects;
5. **Output port**: models output ports and their queueing behavior.

Look into `ch.ethz.systems.netbench.ext.demo` for an impression how to extend the framework.  If you've written an extension, it is necessary to add it in its respective selector in `ch.ethz.systems.netbench.run`. If you've added new properties, be sure to add them in the `ch.ethz.systems.netbench.config.BaseAllowedProperties` class.

More information about the framework can be found in the thesis located at [https://www.research-collection.ethz.ch/handle/20.500.11850/156350](https://www.research-collection.ethz.ch/handle/20.500.11850/156350) (section 4.2: NetBench: Discrete Packet Simulator).

---

## Remarks

#### General remarks about structure

1. Make sure you understand and ran through the Getting Started section above.

2. All the generated files by RIFO are placed within the `./projects/rifo` folder and you can check it for further details.

* **Run configurations**:  To run each experiment, you need to have a configuration file that specifies the settings for that run. Each run's configuration files are in the `./projects/rifo/runs` directory. We utilize the AIFO approach to overwrite some of the configuration parameters in the `MainFigure_.java` files located in the `./src/main/java/ch/ethz/systems/netbench/core/run` directory.

* **Output simulations**: The output of the runs are written to the `./temp/rifo` folder. This directory is useful when you want to run experiments for one of the algorithms and check its impact on the performance.

* **Result analysis**: The scripts used to analyze the simulation results, `analyze.py`, and to generate the paper plots, `plot.gnuplot`, are placed in the `./projects/sppifo/plots` folder, under the same organizational structure:

   * `./project/rifo/plots/rifo_evaluation/pFabric/web_search_workload` contains the results for Figure 7.
   * `./project/rifo/plots/rifo_evaluation/pFabric/data_mining_workload` contains the results for Figure 8.
   * `./project/rifo/plots/rifo_evaluation/pFabric/web_search_workload_T` contains the results for Figure 9.
   * `./project/rifo/plots/rifo_evaluation/pFabric/web_search_workload_q_len` contains the results for Figure 10.
   * `./project/rifo/plots/rifo_evaluation/fairness/web_search_workload` contains the results for Figure 12.
   * `./project/rifo/plots/rifo_evaluation/fairness/data_mining_search_workload` contains the results for Figure 13.
   * `./project/rifo/plots/rifo_evaluation/pFabric/web_search_workload_pareto` contains the results for Figure 14.

* **Main file to run the simulations**: You can run each experiment using the `MainFigure_.java` file in `src/main/java/ch.ethz.systems.netbench/core/run`. The duration of each experiment is one second, but depending on the capacity of the links and the amount of generated traffic, the actual running time of the experiments varies. by running each file, NetBench will simulate `./projects/rifo/runs` and put them in `./temp/rifo/`. The results of those runs will be stored in `./projects/rifo/plots` as plots, along with the data to generate them.

   * Pro tip: Just import the `pom.xml` file to your favorite SDK (we used [IntelliJ IDEA](https://www.jetbrains.com/idea/download/)), which provides all the configuration for the Maven project.

#### Extensions to the original [NetBench](https://github.com/ndal-eth/netbench) and [AIFO](https://github.com/netx-repo/AIFO)

We utilize AIFO's extensions to the original NetBench simulator. Details about those extensions in the following lines.

* **Output ports and transport layers**: They can be found within the *xpt (experimental)* sub-package in the main source code of the simulator (i.e., `src.main.java.ch.ethz.systems.netbench.xpt`). In particular:

   * `xpt/rifo/ports` contains the implementations of the scheduling algorithms used on our simulations (e.g., PIFO, SP-PIFO, AIFO, and RIFO). These algorithms are not available in the original version of NetBench.
   * `core/config/exceptions/BaseAllowedProperties` and `core/config/run/traffic/InfrastructureSelector` contain the configuration parameters which are required to use those output ports and transport layers. 

