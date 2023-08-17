# -*- coding: utf-8 -*-
"""
Created on Thu Nov 25 14:42:05 2021

@author: inet
"""

# Import the libraries
import matplotlib
from matplotlib import colors as mcolors
import matplotlib as mpl
import os, re
import matplotlib
matplotlib.use('Agg')
import matplotlib.pyplot as plt
import numpy as np
from matplotlib.ticker import FuncFormatter
import glob
#from itertools import izip
from utils import *
os.chdir(".")

#from mpl_toolkits.axes_grid.inset_locator import (inset_axes, InsetPosition,mark_inset)

import matplotlib.font_manager
# matplotlib.font_manager._rebuild()

matplotlib.font_manager.findSystemFonts(fontpaths=None, fontext='ttf')
mpl.rcParams['font.family'] = ['serif']
mpl.rcParams['font.serif'] = ['Times New Roman']

set_paper_rcs()




B500_all_Throughput=[]
B500_mean_small=[]
B500_large=[]

B100_all_Throughput=[]
B100_mean_small=[]
B100_large=[]

B50_all_Throughput=[]
B50_mean_small=[]
B50_large=[]


B10_all_Throughput=[]
B10_mean_small=[]
B10_large=[]

B20_all_Throughput=[]
B20_mean_small=[]
B20_large=[]


file = "pFabric_all_throughput_mean_Gbps.dat"
r = open(file, 'r')
lines = r.readlines()[1:]
for i, line in enumerate(lines):
    l=re.findall("[-+]?[.]?[\d]+(?:,\d\d\d)*[\.]?\d*(?:[eE][-+]?\d+)?", line)
    if len(l)>1:
        B10_all_Throughput.append(float(l[1]))
        B20_all_Throughput.append(float(l[2]))
        B50_all_Throughput.append(float(l[3]))
        B100_all_Throughput.append(float(l[4]))
        B500_all_Throughput.append(float(l[5]))

   
file = "pFabric_less_100KB_mean_FCT_ms.dat"
r = open(file, 'r')
lines = r.readlines()[1:]
for i, line in enumerate(lines):
    l=re.findall("[-+]?[.]?[\d]+(?:,\d\d\d)*[\.]?\d*(?:[eE][-+]?\d+)?", line)
    if len(l)>1:
        B10_mean_small.append(float(l[1]))
        B20_mean_small.append(float(l[2]))
        B50_mean_small.append(float(l[3]))
        B100_mean_small.append(float(l[4]))
        B500_mean_small.append(float(l[5]))
    

file = "pFabric_geq_1MB_mean_FCT_ms.dat"
r = open(file, 'r')
lines = r.readlines()[1:]
for i, line in enumerate(lines):
    l=re.findall("[-+]?[.]?[\d]+(?:,\d\d\d)*[\.]?\d*(?:[eE][-+]?\d+)?", line)
    if len(l)>1:
        B10_large.append(float(l[1]))
        B20_large.append(float(l[2]))
        B50_large.append(float(l[3]))
        B100_large.append(float(l[4]))
        B500_large.append(float(l[5]))
        
RIFO_color='tab:red'
B500_color='tab:blue'
B100_color='tab:orange'
B50_color='tab:green'
B20_color='tab:purple'
B10_color='tab:olive'

smallColor='black'


xlabeles=[0.2,0.3,0.4,0.5,0.6,0.7,0.8]
#******************************** avgThroughput small*************************************
fig,ax = plt.subplots(nrows=1, ncols=1)

ax.plot((B500_mean_small),label='B=500' ,color=B500_color,linestyle='-', mfc='tab:blue',marker='s', markersize=3,lw=1 ,  mew=0.65)
ax.plot((B100_mean_small),label='B=100' ,color=B100_color,linestyle='-', mfc='tab:orange',marker='o', markersize=3,lw=1 ,  mew=0.65)
ax.plot((B50_mean_small),label='B=50' ,color=B50_color,linestyle='-', mfc='tab:green',marker='X', markersize=3,lw=1 ,  mew=0.65)
ax.plot((B20_mean_small),label='B=20' ,color=B20_color,linestyle='-', mfc='tab:purple',marker='^', markersize=3,lw=1 ,  mew=0.65)
ax.plot((B10_mean_small),label='B=10' ,color=B10_color,linestyle='-', mfc='tab:olive',marker='v', markersize=3,lw=1 ,  mew=0.65)

ax.grid(color='black', ls = '--',dashes=(5, 15), lw = 0.2,alpha=1)
# legend =plt.legend(bbox_to_anchor=(0.95, 1.05),loc="best",numpoints=2, frameon=True, ncol=3, columnspacing=0.8, handletextpad=0.2)
legend =plt.legend(loc="upper left",numpoints=2, frameon=True, ncol=1, columnspacing=0.8, handletextpad=0.2)

# ax.title.set_text('Flow size (0, 100KB)')
# ytic=[0.35,0.40,0.45,0.50,0.55]
ax.set_ylim(-.020,0.6)
ax.set_yticks(np.arange(0,0.7,0.1))
# ax.set_yticks(ytic)
# ax.set_yticklabels([str(i) for i in ytic])
xlabeles=[0.2,0.3,0.4,0.5,0.6,0.7,0.8]
print(xlabeles)
for ax in fig.get_axes():
    ax.set_xticks(range(0,7))
    ax.set_xticklabels([str(i) for i in xlabeles])
    ax.set_xlabel('Load')
    ax.set_ylabel('Average FCT (ms)')
    

fig.tight_layout() 
name='avgFCT-small-websearch-qLen'
plt.savefig('%s.pdf'%name,format="pdf", bbox_inches='tight', pad_inches=0.05)
plt.close()


#******************************** all_Throughput small*************************************
set_paper_rcs()

fig,ax = plt.subplots(nrows=1, ncols=1)

ax.plot((B500_all_Throughput),label='B=500' ,color=B500_color,linestyle='-', mfc='tab:blue',marker='s', markersize=3,lw=1 ,  mew=0.65)
ax.plot((B100_all_Throughput),label='B=100' ,color=B100_color,linestyle='-', mfc='tab:orange',marker='o', markersize=3,lw=1 ,  mew=0.65)
ax.plot((B50_all_Throughput),label='B=50' ,color=B50_color,linestyle='-', mfc='tab:green',marker='X', markersize=3,lw=1 ,  mew=0.65)
ax.plot((B20_all_Throughput),label='B=20' ,color=B20_color,linestyle='-', mfc='tab:purple',marker='^', markersize=3,lw=1 ,  mew=0.65)
ax.plot((B10_all_Throughput),label='B=10' ,color=B10_color,linestyle='-', mfc='tab:olive',marker='v', markersize=3,lw=1 ,  mew=0.65)


ax.grid(color='black', ls = '--',dashes=(5, 15), lw = 0.2,alpha=1)
# legend =plt.legend(bbox_to_anchor=(0.95, 1.05),loc="best",numpoints=2, frameon=True, ncol=3, columnspacing=0.8, handletextpad=0.2)
legend =plt.legend(loc="best",numpoints=2, frameon=True, ncol=1, columnspacing=0.8, handletextpad=0.2)

ax.set_ylim(0,7)
ax.set_yticks(np.arange(0,8,1))
# ax.title.set_text('Flow size (0, 100KB)')
for ax in fig.get_axes():
    ax.set_xticks(range(0,7))
    ax.set_xticklabels([str(i) for i in xlabeles])
    ax.set_xlabel('Load')
    ax.set_ylabel('Average~throughput~(Gbps)')    

fig.tight_layout() 
name='avgThroughput-all-websearch-qLen'
plt.savefig('%s.pdf'%name,format="pdf", bbox_inches='tight', pad_inches=0.05)
plt.close()

#**************************Large********************************************
set_paper_rcs()

fig,ax = plt.subplots(nrows=1, ncols=1)
ax.plot((B500_large),label='B=500' ,color=B500_color,linestyle='-', mfc='tab:blue',marker='s', markersize=3,lw=1 ,  mew=0.65)
ax.plot((B100_large),label='B=100' ,color=B100_color,linestyle='-', mfc='tab:orange',marker='o', markersize=3,lw=1 ,  mew=0.65)
ax.plot((B50_large),label='B=50' ,color=B50_color,linestyle='-', mfc='tab:green',marker='X', markersize=3,lw=1 ,  mew=0.65)
ax.plot((B20_large),label='B=20' ,color=B20_color,linestyle='-', mfc='tab:purple',marker='^', markersize=3,lw=1 ,  mew=0.65)
ax.plot((B10_large),label='B=10' ,color=B10_color,linestyle='-', mfc='tab:olive',marker='v', markersize=3,lw=1 ,  mew=0.65)


# ax.title.set_text('Large flows')
# legend =plt.legend(loc="best",numpoints=2, frameon=False, ncol=1, columnspacing=0.8, handletextpad=0.2)
legend =plt.legend(loc="best",numpoints=2, frameon=True, ncol=1, columnspacing=0.8, handletextpad=0.2)

ax.set_ylim(0,100)
ax.set_yticks(range(0,120,20))


for ax in fig.get_axes():
    ax.set_xticks(range(0,7))
    ax.set_xticklabels([str(i) for i in xlabeles])
    ax.set_xlabel('Load')
    ax.set_ylabel('Average FCT (ms)')
       
ax.grid(color='black', ls = '--',dashes=(5, 15), lw = 0.2,alpha=1)
fig.tight_layout() 
name='avgFCT-large-websearch-qLen'
plt.savefig('%s.pdf'%name,format="pdf", bbox_inches='tight', pad_inches=0.05)
plt.close()


