#!/usr/bin/python

# This python scripts extracts the data from the logs that we want to plot and outputs it in a format that gnuplot can
# later on represent.

# Theoretical plot number of combinations
#!/usr/bin/python
import math

if __name__ == '__main__':

########################################################################################################################

    # Mean global flow completion time vs. utilization
    lambdas = [4000, 6000, 10000, 15000, 22500, 37000, 60000]
    FCTs = [[0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0]]
    row = 0

    for x in lambdas:
        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/TCP/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_mean_fct_ms" in line:
                FCTs[row][0]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/DCTCP/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_mean_fct_ms" in line:
                FCTs[row][1]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/AFQ_32/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_mean_fct_ms" in line:
                FCTs[row][2]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/SPPIFOWFQ_32/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_mean_fct_ms" in line:
                FCTs[row][3]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/PIFOWFQ_32/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_mean_fct_ms" in line:
                FCTs[row][4]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/AIFOWFQ/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_mean_fct_ms" in line:
                FCTs[row][5]=line.split("=")[1].split("\n")[0]
                break
        r.close()
        
        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/RIFOWFQ/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_mean_fct_ms" in line:
                FCTs[row][6]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        row = row + 1

    w = open('projects/rifo/plots/rifo_evaluation/fairness/data_mining_workload/fairness_less_100KB_mean_fct_ms_32.dat', 'w')
    w.write("#    TCP    DCTCP    AFQ_32    SPPIFOWFQ_32    PIFOWFQ_32    AIFOWFQ    RIFOWFQ\n")
    w.write("4000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[0][0], FCTs[0][1], FCTs[0][2], FCTs[0][3], FCTs[0][4], FCTs[0][5], FCTs[0][6]))
    w.write("6000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[1][0], FCTs[1][1], FCTs[1][2], FCTs[1][3], FCTs[1][4], FCTs[1][5], FCTs[1][6]))
    w.write("10000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[2][0], FCTs[2][1], FCTs[2][2], FCTs[2][3], FCTs[2][4], FCTs[2][5], FCTs[2][6]))
    w.write("15000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[3][0], FCTs[3][1], FCTs[3][2], FCTs[3][3], FCTs[3][4], FCTs[3][5], FCTs[3][6]))
    w.write("22500   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[4][0], FCTs[4][1], FCTs[4][2], FCTs[4][3], FCTs[4][4], FCTs[4][5], FCTs[4][6]))
    w.write("37000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[5][0], FCTs[5][1], FCTs[5][2], FCTs[5][3], FCTs[5][4], FCTs[5][5], FCTs[5][6]))
    w.write("60000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[6][0], FCTs[6][1], FCTs[6][2], FCTs[6][3], FCTs[6][4], FCTs[6][5], FCTs[6][6]))
    w.close()



########################################################################################################################

    # Mean global flow completion time vs. utilization
    lambdas = [4000, 6000, 10000, 15000, 22500, 37000, 60000]
    FCTs = [[0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0]]
    row = 0

    for x in lambdas:
        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/TCP/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_2MB_mean_fct_ms" in line:
                FCTs[row][0]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/DCTCP/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_2MB_mean_fct_ms" in line:
                FCTs[row][1]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/AFQ_32/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_2MB_mean_fct_ms" in line:
                FCTs[row][2]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/SPPIFOWFQ_32/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_2MB_mean_fct_ms" in line:
                FCTs[row][3]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/PIFOWFQ_32/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_2MB_mean_fct_ms" in line:
                FCTs[row][4]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/AIFOWFQ/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_2MB_mean_fct_ms" in line:
                FCTs[row][5]=line.split("=")[1].split("\n")[0]
                break
        r.close()
        
        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/RIFOWFQ/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_2MB_mean_fct_ms" in line:
                FCTs[row][6]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        row = row + 1

    w = open('projects/rifo/plots/rifo_evaluation/fairness/data_mining_workload/fairness_geq_2MB_mean_fct_ms_32.dat', 'w')
    w.write("#    TCP    DCTCP    AFQ_32    SPPIFOWFQ_32    PIFOWFQ_32    AIFOWFQ    RIFOWFQ\n")
    w.write("4000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[0][0], FCTs[0][1], FCTs[0][2], FCTs[0][3], FCTs[0][4], FCTs[0][5], FCTs[0][6]))
    w.write("6000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[1][0], FCTs[1][1], FCTs[1][2], FCTs[1][3], FCTs[1][4], FCTs[1][5], FCTs[1][6]))
    w.write("10000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[2][0], FCTs[2][1], FCTs[2][2], FCTs[2][3], FCTs[2][4], FCTs[2][5], FCTs[2][6]))
    w.write("15000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[3][0], FCTs[3][1], FCTs[3][2], FCTs[3][3], FCTs[3][4], FCTs[3][5], FCTs[3][6]))
    w.write("22500   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[4][0], FCTs[4][1], FCTs[4][2], FCTs[4][3], FCTs[4][4], FCTs[4][5], FCTs[4][6]))
    w.write("37000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[5][0], FCTs[5][1], FCTs[5][2], FCTs[5][3], FCTs[5][4], FCTs[5][5], FCTs[5][6]))
    w.write("60000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[6][0], FCTs[6][1], FCTs[6][2], FCTs[6][3], FCTs[6][4], FCTs[6][5], FCTs[6][6]))
    w.close()


########################################################################################################################

    # Mean global flow completion time vs. utilization
    lambdas = [4000, 6000, 10000, 15000, 22500, 37000, 60000]
    FCTs = [[0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0]]
    row = 0

    for x in lambdas:
        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/TCP/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_1MB_mean_fct_ms" in line:
                FCTs[row][0]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/DCTCP/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_1MB_mean_fct_ms" in line:
                FCTs[row][1]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/AFQ_32/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_1MB_mean_fct_ms" in line:
                FCTs[row][2]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/SPPIFOWFQ_32/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_1MB_mean_fct_ms" in line:
                FCTs[row][3]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/PIFOWFQ_32/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_1MB_mean_fct_ms" in line:
                FCTs[row][4]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/AIFOWFQ/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_1MB_mean_fct_ms" in line:
                FCTs[row][5]=line.split("=")[1].split("\n")[0]
                break
        r.close()
        
        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/RIFOWFQ/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "geq_1MB_mean_fct_ms" in line:
                FCTs[row][6]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        row = row + 1

    w = open('projects/rifo/plots/rifo_evaluation/fairness/data_mining_workload/fairness_geq_1MB_mean_fct_ms_32.dat', 'w')
    w.write("#    TCP    DCTCP    AFQ_32    SPPIFOWFQ_32    PIFOWFQ_32    AIFOWFQ    RIFOWFQ\n")
    w.write("4000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[0][0], FCTs[0][1], FCTs[0][2], FCTs[0][3], FCTs[0][4], FCTs[0][5], FCTs[0][6]))
    w.write("6000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[1][0], FCTs[1][1], FCTs[1][2], FCTs[1][3], FCTs[1][4], FCTs[1][5], FCTs[1][6]))
    w.write("10000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[2][0], FCTs[2][1], FCTs[2][2], FCTs[2][3], FCTs[2][4], FCTs[2][5], FCTs[2][6]))
    w.write("15000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[3][0], FCTs[3][1], FCTs[3][2], FCTs[3][3], FCTs[3][4], FCTs[3][5], FCTs[3][6]))
    w.write("22500   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[4][0], FCTs[4][1], FCTs[4][2], FCTs[4][3], FCTs[4][4], FCTs[4][5], FCTs[4][6]))
    w.write("37000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[5][0], FCTs[5][1], FCTs[5][2], FCTs[5][3], FCTs[5][4], FCTs[5][5], FCTs[5][6]))
    w.write("60000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[6][0], FCTs[6][1], FCTs[6][2], FCTs[6][3], FCTs[6][4], FCTs[6][5], FCTs[6][6]))
    w.close()





########################################################################################################################

    # Mean global flow completion time vs. utilization
    lambdas = [4000, 6000, 10000, 15000, 22500, 37000, 60000]
    FCTs = [[0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0],
            [0,0,0,0,0,0,0]]
    row = 0

    for x in lambdas:
        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/TCP/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_99th_fct_ms" in line:
                FCTs[row][0]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/DCTCP/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_99th_fct_ms" in line:
                FCTs[row][1]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/AFQ_32/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_99th_fct_ms" in line:
                FCTs[row][2]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/SPPIFOWFQ_32/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_99th_fct_ms" in line:
                FCTs[row][3]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/PIFOWFQ_32/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_99th_fct_ms" in line:
                FCTs[row][4]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/AIFOWFQ/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_99th_fct_ms" in line:
                FCTs[row][5]=line.split("=")[1].split("\n")[0]
                break
        r.close()
        
        file = "temp/rifo/rifo_evaluation/fairness/data_mining_workload/"+str(x)+"/RIFOWFQ/analysis/flow_completion.statistics"
        r = open(file, 'r')
        lines = r.readlines()
        for i, line in enumerate(lines):
            if "less_100KB_99th_fct_ms" in line:
                FCTs[row][6]=line.split("=")[1].split("\n")[0]
                break
        r.close()

        row = row + 1

    w = open('projects/rifo/plots/rifo_evaluation/fairness/data_mining_workload/fairness_less_100KB_99th_fct_ms_32.dat', 'w')
    w.write("#    TCP    DCTCP    AFQ_32    SPPIFOWFQ_32    PIFOWFQ_32    AIFOWFQ    RIFOWFQ\n")
    w.write("4000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[0][0], FCTs[0][1], FCTs[0][2], FCTs[0][3], FCTs[0][4], FCTs[0][5], FCTs[0][6]))
    w.write("6000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[1][0], FCTs[1][1], FCTs[1][2], FCTs[1][3], FCTs[1][4], FCTs[1][5], FCTs[1][6]))
    w.write("10000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[2][0], FCTs[2][1], FCTs[2][2], FCTs[2][3], FCTs[2][4], FCTs[2][5], FCTs[2][6]))
    w.write("15000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[3][0], FCTs[3][1], FCTs[3][2], FCTs[3][3], FCTs[3][4], FCTs[3][5], FCTs[3][6]))
    w.write("22500   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[4][0], FCTs[4][1], FCTs[4][2], FCTs[4][3], FCTs[4][4], FCTs[4][5], FCTs[4][6]))
    w.write("37000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[5][0], FCTs[5][1], FCTs[5][2], FCTs[5][3], FCTs[5][4], FCTs[5][5], FCTs[5][6]))
    w.write("60000   %s    %s    %s    %s    %s    %s    %s\n" % (FCTs[6][0], FCTs[6][1], FCTs[6][2], FCTs[6][3], FCTs[6][4], FCTs[6][5], FCTs[6][6]))
    w.close()

    ########################################################################################################################

    # Split FCT FQ at 70% utilization
    fct_10KB_mean = [0,0,0,0,0,0,0]
    fct_20KB_mean = [0,0,0,0,0,0,0]
    fct_30KB_mean = [0,0,0,0,0,0,0]
    fct_50KB_mean = [0,0,0,0,0,0,0]
    fct_80KB_mean = [0,0,0,0,0,0,0]
    fct_200KB1MB_mean = [0,0,0,0,0,0,0]
    fct_geq_2MB_mean = [0,0,0,0,0,0,0]

    fct_10KB_99th = [0,0,0,0,0,0,0]
    fct_20KB_99th = [0,0,0,0,0,0,0]
    fct_30KB_99th = [0,0,0,0,0,0,0]
    fct_50KB_99th = [0,0,0,0,0,0,0]
    fct_80KB_99th = [0,0,0,0,0,0,0]
    fct_200KB1MB_99th = [0,0,0,0,0,0,0]
    fct_geq_2MB_99th = [0,0,0,0,0,0,0]

    r = open("temp/rifo/rifo_evaluation/fairness/data_mining_workload/37000/TCP/analysis/flow_completion.statistics", 'r')
    lines = r.readlines()
    print('start')
    for i, line in enumerate(lines):
        #print(line)
        if "mean_fct_ms" in line:
            if line.split("=")[0] == "10KB_mean_fct_ms":
                fct_10KB_mean[0]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_mean_fct_ms":
                fct_20KB_mean[0]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_mean_fct_ms":
                fct_30KB_mean[0]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_mean_fct_ms":
                fct_50KB_mean[0]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_mean_fct_ms":
                fct_80KB_mean[0]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_mean_fct_ms":
                fct_200KB1MB_mean[0]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_mean_fct_ms":
                fct_geq_2MB_mean[0]=line.split("=")[1].split("\n")[0]

        if "99th_fct_ms" in line:
            if line.split("=")[0] == "10KB_99th_fct_ms":
                fct_10KB_99th[0]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_99th_fct_ms":
                fct_20KB_99th[0]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_99th_fct_ms":
                fct_30KB_99th[0]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_99th_fct_ms":
                fct_50KB_99th[0]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_99th_fct_ms":
                fct_80KB_99th[0]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_99th_fct_ms":
                fct_200KB1MB_99th[0]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_99th_fct_ms":
                fct_geq_2MB_99th[0]=line.split("=")[1].split("\n")[0]
    r.close()

    r = open("temp/rifo/rifo_evaluation/fairness/data_mining_workload/37000/DCTCP/analysis/flow_completion.statistics", 'r')
    lines = r.readlines()
    for i, line in enumerate(lines):
        if "mean_fct_ms" in line:
            if line.split("=")[0] == "10KB_mean_fct_ms":
                fct_10KB_mean[1]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_mean_fct_ms":
                fct_20KB_mean[1]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_mean_fct_ms":
                fct_30KB_mean[1]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_mean_fct_ms":
                fct_50KB_mean[1]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_mean_fct_ms":
                fct_80KB_mean[1]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_mean_fct_ms":
                fct_200KB1MB_mean[1]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_mean_fct_ms":
                fct_geq_2MB_mean[1]=line.split("=")[1].split("\n")[0]

        if "99th_fct_ms" in line:
            if line.split("=")[0] == "10KB_99th_fct_ms":
                fct_10KB_99th[1]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_99th_fct_ms":
                fct_20KB_99th[1]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_99th_fct_ms":
                fct_30KB_99th[1]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_99th_fct_ms":
                fct_50KB_99th[1]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_99th_fct_ms":
                fct_80KB_99th[1]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_99th_fct_ms":
                fct_200KB1MB_99th[1]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_99th_fct_ms":
                fct_geq_2MB_99th[1]=line.split("=")[1].split("\n")[0]
    r.close()

    r = open("temp/rifo/rifo_evaluation/fairness/data_mining_workload/37000/AFQ_32/analysis/flow_completion.statistics", 'r')
    lines = r.readlines()
    for i, line in enumerate(lines):
        if "mean_fct_ms" in line:
            if line.split("=")[0] == "10KB_mean_fct_ms":
                fct_10KB_mean[2]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_mean_fct_ms":
                fct_20KB_mean[2]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_mean_fct_ms":
                fct_30KB_mean[2]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_mean_fct_ms":
                fct_50KB_mean[2]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_mean_fct_ms":
                fct_80KB_mean[2]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_mean_fct_ms":
                fct_200KB1MB_mean[2]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_mean_fct_ms":
                fct_geq_2MB_mean[2]=line.split("=")[1].split("\n")[0]

        if "99th_fct_ms" in line:
            if line.split("=")[0] == "10KB_99th_fct_ms":
                fct_10KB_99th[2]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_99th_fct_ms":
                fct_20KB_99th[2]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_99th_fct_ms":
                fct_30KB_99th[2]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_99th_fct_ms":
                fct_50KB_99th[2]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_99th_fct_ms":
                fct_80KB_99th[2]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_99th_fct_ms":
                fct_200KB1MB_99th[2]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_99th_fct_ms":
                fct_geq_2MB_99th[2]=line.split("=")[1].split("\n")[0]
    r.close()

    r = open("temp/rifo/rifo_evaluation/fairness/data_mining_workload/37000/SPPIFOWFQ_32/analysis/flow_completion.statistics", 'r')
    lines = r.readlines()
    for i, line in enumerate(lines):
        if "mean_fct_ms" in line:
            if line.split("=")[0] == "10KB_mean_fct_ms":
                fct_10KB_mean[3]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_mean_fct_ms":
                fct_20KB_mean[3]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_mean_fct_ms":
                fct_30KB_mean[3]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_mean_fct_ms":
                fct_50KB_mean[3]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_mean_fct_ms":
                fct_80KB_mean[3]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_mean_fct_ms":
                fct_200KB1MB_mean[3]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_mean_fct_ms":
                fct_geq_2MB_mean[3]=line.split("=")[1].split("\n")[0]

        if "99th_fct_ms" in line:
            if line.split("=")[0] == "10KB_99th_fct_ms":
                fct_10KB_99th[3]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_99th_fct_ms":
                fct_20KB_99th[3]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_99th_fct_ms":
                fct_30KB_99th[3]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_99th_fct_ms":
                fct_50KB_99th[3]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_99th_fct_ms":
                fct_80KB_99th[3]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_99th_fct_ms":
                fct_200KB1MB_99th[3]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_99th_fct_ms":
                fct_geq_2MB_99th[3]=line.split("=")[1].split("\n")[0]
    r.close()

    r = open("temp/rifo/rifo_evaluation/fairness/data_mining_workload/37000/PIFOWFQ_32/analysis/flow_completion.statistics", 'r')
    lines = r.readlines()
    for i, line in enumerate(lines):
        if "mean_fct_ms" in line:
            if line.split("=")[0] == "10KB_mean_fct_ms":
                fct_10KB_mean[4]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_mean_fct_ms":
                fct_20KB_mean[4]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_mean_fct_ms":
                fct_30KB_mean[4]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_mean_fct_ms":
                fct_50KB_mean[4]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_mean_fct_ms":
                fct_80KB_mean[4]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_mean_fct_ms":
                fct_200KB1MB_mean[4]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_mean_fct_ms":
                fct_geq_2MB_mean[4]=line.split("=")[1].split("\n")[0]

        if "99th_fct_ms" in line:
            if line.split("=")[0] == "10KB_99th_fct_ms":
                fct_10KB_99th[4]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_99th_fct_ms":
                fct_20KB_99th[4]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_99th_fct_ms":
                fct_30KB_99th[4]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_99th_fct_ms":
                fct_50KB_99th[4]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_99th_fct_ms":
                fct_80KB_99th[4]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_99th_fct_ms":
                fct_200KB1MB_99th[4]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_99th_fct_ms":
                fct_geq_2MB_99th[4]=line.split("=")[1].split("\n")[0]

    r = open("temp/rifo/rifo_evaluation/fairness/data_mining_workload/37000/AIFOWFQ/analysis/flow_completion.statistics", 'r')
    lines = r.readlines()
    for i, line in enumerate(lines):
        if "mean_fct_ms" in line:
            if line.split("=")[0] == "10KB_mean_fct_ms":
                fct_10KB_mean[5]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_mean_fct_ms":
                fct_20KB_mean[5]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_mean_fct_ms":
                fct_30KB_mean[5]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_mean_fct_ms":
                fct_50KB_mean[5]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_mean_fct_ms":
                fct_80KB_mean[5]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_mean_fct_ms":
                fct_200KB1MB_mean[5]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_mean_fct_ms":
                fct_geq_2MB_mean[5]=line.split("=")[1].split("\n")[0]

        if "99th_fct_ms" in line:
            if line.split("=")[0] == "10KB_99th_fct_ms":
                fct_10KB_99th[5]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_99th_fct_ms":
                fct_20KB_99th[5]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_99th_fct_ms":
                fct_30KB_99th[5]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_99th_fct_ms":
                fct_50KB_99th[5]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_99th_fct_ms":
                fct_80KB_99th[5]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_99th_fct_ms":
                fct_200KB1MB_99th[5]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_99th_fct_ms":
                fct_geq_2MB_99th[5]=line.split("=")[1].split("\n")[0]
    r.close()
    
    r = open("temp/rifo/rifo_evaluation/fairness/data_mining_workload/37000/RIFOWFQ/analysis/flow_completion.statistics", 'r')
    lines = r.readlines()
    for i, line in enumerate(lines):
        if "mean_fct_ms" in line:
            if line.split("=")[0] == "10KB_mean_fct_ms":
                fct_10KB_mean[6]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_mean_fct_ms":
                fct_20KB_mean[6]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_mean_fct_ms":
                fct_30KB_mean[6]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_mean_fct_ms":
                fct_50KB_mean[6]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_mean_fct_ms":
                fct_80KB_mean[6]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_mean_fct_ms":
                fct_200KB1MB_mean[6]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_mean_fct_ms":
                fct_geq_2MB_mean[6]=line.split("=")[1].split("\n")[0]

        if "99th_fct_ms" in line:
            if line.split("=")[0] == "10KB_99th_fct_ms":
                fct_10KB_99th[6]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "20KB_99th_fct_ms":
                fct_20KB_99th[6]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "30KB_99th_fct_ms":
                fct_30KB_99th[6]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "50KB_99th_fct_ms":
                fct_50KB_99th[6]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "80KB_99th_fct_ms":
                fct_80KB_99th[6]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "200KB-1MB_99th_fct_ms":
                fct_200KB1MB_99th[6]=line.split("=")[1].split("\n")[0]
            elif line.split("=")[0] == "geq_2MB_99th_fct_ms":
                fct_geq_2MB_99th[6]=line.split("=")[1].split("\n")[0]
    r.close()

    w = open('projects/rifo/plots/rifo_evaluation/fairness/data_mining_workload/fairness_split_mean_fct_ms_32.dat', 'w')
    w.write("#    TCP    TCP_9    a    DCTCP    DCTCP_9    b    AFQ_32    AFQ_32_9    c    SPPIFOWFQ_32    SPPIFOWFQ_32_9    d    PIFOWFQ_32    PIFOWFQ_32_9    e    AIFOWFQ    AIFOWFQ_9    f    RIFOWFQ    RIFOWFQ_9    g\n")
    w.write("2M+   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s    %s    %s   %s    %s    %s   %s\n"    % (fct_geq_2MB_mean[0],    fct_geq_2MB_99th[0],    fct_geq_2MB_mean[0],    fct_geq_2MB_mean[1],    fct_geq_2MB_99th[1],    fct_geq_2MB_mean[1],     fct_geq_2MB_mean[2],    fct_geq_2MB_99th[2],    fct_geq_2MB_mean[2],     fct_geq_2MB_mean[3],    fct_geq_2MB_99th[3],    fct_geq_2MB_mean[3],     fct_geq_2MB_mean[4],    fct_geq_2MB_99th[4],    fct_geq_2MB_mean[4],     fct_geq_2MB_mean[5],    fct_geq_2MB_99th[5],    fct_geq_2MB_mean[5],     fct_geq_2MB_mean[6],    fct_geq_2MB_99th[6],    fct_geq_2MB_mean[6]))
    w.write("200K-1M   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s    %s    %s   %s    %s    %s   %s\n"   % (fct_200KB1MB_mean[0],    fct_200KB1MB_99th[0],    fct_200KB1MB_mean[0],    fct_200KB1MB_mean[1],    fct_200KB1MB_99th[1],    fct_200KB1MB_mean[1],     fct_200KB1MB_mean[2],    fct_200KB1MB_99th[2],    fct_200KB1MB_mean[2],     fct_200KB1MB_mean[3],    fct_200KB1MB_99th[3],    fct_200KB1MB_mean[3],     fct_200KB1MB_mean[4],    fct_200KB1MB_99th[4],    fct_200KB1MB_mean[4],     fct_200KB1MB_mean[5],    fct_200KB1MB_99th[5],    fct_200KB1MB_mean[5],     fct_200KB1MB_mean[6],    fct_200KB1MB_99th[6],    fct_200KB1MB_mean[6]))
    w.write("80K   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s    %s    %s   %s    %s    %s   %s\n"       % (fct_80KB_mean[0],    fct_80KB_99th[0],    fct_80KB_mean[0],    fct_80KB_mean[1],    fct_80KB_99th[1],    fct_80KB_mean[1],     fct_80KB_mean[2],    fct_80KB_99th[2],    fct_80KB_mean[2],     fct_80KB_mean[3],    fct_80KB_99th[3],    fct_80KB_mean[3],     fct_80KB_mean[4],    fct_80KB_99th[4],    fct_80KB_mean[4],     fct_80KB_mean[5],    fct_80KB_99th[5],    fct_80KB_mean[5],     fct_80KB_mean[6],    fct_80KB_99th[6],    fct_80KB_mean[6]))
    w.write("50K   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s    %s    %s   %s    %s    %s   %s\n"       % (fct_50KB_mean[0],    fct_50KB_99th[0],    fct_50KB_mean[0],    fct_50KB_mean[1],    fct_50KB_99th[1],    fct_50KB_mean[1],     fct_50KB_mean[2],    fct_50KB_99th[2],    fct_50KB_mean[2],     fct_50KB_mean[3],    fct_50KB_99th[3],    fct_50KB_mean[3],     fct_50KB_mean[4],    fct_50KB_99th[4],    fct_50KB_mean[4],     fct_50KB_mean[5],    fct_50KB_99th[5],    fct_50KB_mean[5],     fct_50KB_mean[6],    fct_50KB_99th[6],    fct_50KB_mean[6]))
    w.write("30K   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s    %s    %s   %s    %s    %s   %s\n"       % (fct_30KB_mean[0],    fct_30KB_99th[0],    fct_30KB_mean[0],    fct_30KB_mean[1],    fct_30KB_99th[1],    fct_30KB_mean[1],     fct_30KB_mean[2],    fct_30KB_99th[2],    fct_30KB_mean[2],     fct_30KB_mean[3],    fct_30KB_99th[3],    fct_30KB_mean[3],     fct_30KB_mean[4],    fct_30KB_99th[4],    fct_30KB_mean[4],     fct_30KB_mean[5],    fct_30KB_99th[5],    fct_30KB_mean[5],     fct_30KB_mean[6],    fct_30KB_99th[6],    fct_30KB_mean[6]))
    w.write("20K   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s    %s    %s   %s    %s    %s   %s\n"       % (fct_20KB_mean[0],    fct_20KB_99th[0],    fct_20KB_mean[0],    fct_20KB_mean[1],    fct_20KB_99th[1],    fct_20KB_mean[1],     fct_20KB_mean[2],    fct_20KB_99th[2],    fct_20KB_mean[2],     fct_20KB_mean[3],    fct_20KB_99th[3],    fct_20KB_mean[3],     fct_20KB_mean[4],    fct_20KB_99th[4],    fct_20KB_mean[4],     fct_20KB_mean[5],    fct_20KB_99th[5],    fct_20KB_mean[5],     fct_20KB_mean[6],    fct_20KB_99th[6],    fct_20KB_mean[6]))
    w.write("10K   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s   %s    %s    %s    %s   %s    %s    %s   %s    %s    %s   %s\n"       % (fct_10KB_mean[0],    fct_10KB_99th[0],    fct_10KB_mean[0],    fct_10KB_mean[1],    fct_10KB_99th[1],    fct_10KB_mean[1],     fct_10KB_mean[2],    fct_10KB_99th[2],    fct_10KB_mean[2],     fct_10KB_mean[3],    fct_10KB_99th[3],    fct_10KB_mean[3],     fct_10KB_mean[4],    fct_10KB_99th[4],    fct_10KB_mean[4],     fct_10KB_mean[5],    fct_10KB_99th[5],    fct_10KB_mean[5],     fct_10KB_mean[6],    fct_10KB_99th[6],    fct_10KB_mean[6]))
    w.close()

########################################################################################################################
