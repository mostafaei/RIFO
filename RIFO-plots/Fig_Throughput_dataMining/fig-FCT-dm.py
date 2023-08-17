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



RIFO_all_Throughput=[]
RIFO_mean_small=[]
RIFO_large=[]

AIFO_all_Throughput=[]
AIFO_mean_small=[]
AIFO_large=[]

SPPIFO_all_Throughput=[]
SPPIFO_mean_small=[]
SPPIFO_large=[]

PIFO_all_Throughput=[]
PIFO_mean_small=[]
PIFO_large=[]


TCP_all_Throughput=[]
TCP_mean_small=[]
TCP_large=[]

DCTCP_all_Throughput=[]
DCTCP_mean_small=[]
DCTCP_large=[]


file = "pFabric_all_throughput_mean_Gbps.dat"
r = open(file, 'r')
lines = r.readlines()
for i, line in enumerate(lines):
    l=re.findall("[-+]?[.]?[\d]+(?:,\d\d\d)*[\.]?\d*(?:[eE][-+]?\d+)?", line)
    if len(l)>1:
        TCP_all_Throughput.append(float(l[1]))
        DCTCP_all_Throughput.append(float(l[2]))
        PIFO_all_Throughput.append(float(l[3]))
        SPPIFO_all_Throughput.append(float(l[4]))
        AIFO_all_Throughput.append(float(l[5]))
        RIFO_all_Throughput.append(float(l[6]))
'''    
file = "pFabric_less_100KB_mean_Throughput_ms.dat"
r = open(file, 'r')
lines = r.readlines()
for i, line in enumerate(lines):
    l=re.findall("[-+]?[.]?[\d]+(?:,\d\d\d)*[\.]?\d*(?:[eE][-+]?\d+)?", line)
    if len(l)>1:
        TCP_mean_small.append(float(l[1]))
        DCTCP_mean_small.append(float(l[2]))
        PIFO_mean_small.append(float(l[3]))
        SPPIFO_mean_small.append(float(l[4]))
        AIFO_mean_small.append(float(l[5]))
        RIFO_mean_small.append(float(l[6]))
    

file = "pFabric_geq_1MB_mean_Throughput_ms.dat"
r = open(file, 'r')
lines = r.readlines()
for i, line in enumerate(lines):
    l=re.findall("[-+]?[.]?[\d]+(?:,\d\d\d)*[\.]?\d*(?:[eE][-+]?\d+)?", line)
    if len(l)>1:
        TCP_large.append(float(l[1]))
        DCTCP_large.append(float(l[2]))
        PIFO_large.append(float(l[3]))
        SPPIFO_large.append(float(l[4]))
        AIFO_large.append(float(l[5]))
        RIFO_large.append(float(l[6]))
'''        
RIFO_color='tab:red'
AIFO_color='tab:blue'
SPPIFO_color='tab:orange'
PIFO_color='tab:green'
DCTCP_color='tab:purple'
TCP_color='tab:olive'

smallColor='black'


xlabeles=[0.2,0.3,0.4,0.5,0.6,0.7,0.8]
#******************************** avgThroughput small*************************************
'''
fig,ax = plt.subplots(nrows=1, ncols=1)

ax.plot((RIFO_mean_small),label='RIFO' ,color=RIFO_color,linestyle='-', mfc='tab:red',marker='d', markersize=3,lw=1 ,  mew=0.65)
ax.plot((AIFO_mean_small),label='AIFO' ,color=AIFO_color,linestyle='-', mfc='tab:blue',marker='s', markersize=3,lw=1 ,  mew=0.65)
ax.plot((SPPIFO_mean_small),label='SP-PIFO' ,color=SPPIFO_color,linestyle='-', mfc='tab:orange',marker='o', markersize=3,lw=1 ,  mew=0.65)
ax.plot((PIFO_mean_small),label='PIFO' ,color=PIFO_color,linestyle='-', mfc='tab:green',marker='X', markersize=3,lw=1 ,  mew=0.65)
ax.plot((DCTCP_mean_small),label='DCTCP' ,color=DCTCP_color,linestyle='-', mfc='tab:purple',marker='^', markersize=3,lw=1 ,  mew=0.65)
ax.plot((TCP_mean_small),label='TCP' ,color=TCP_color,linestyle='-', mfc='tab:olive',marker='v', markersize=3,lw=1 ,  mew=0.65)

ax.grid(color='black', ls = '--',dashes=(5, 15), lw = 0.2,alpha=1)
# legend =plt.legend(bbox_to_anchor=(0.95, 1.05),loc="best",numpoints=2, frameon=True, ncol=3, columnspacing=0.8, handletextpad=0.2)
legend =plt.legend(loc="upper left",numpoints=2, frameon=True, ncol=3, columnspacing=0.8, handletextpad=0.2)

# ax.title.set_text('Flow size (0, 100KB)')
# ytic=[0.35,0.40,0.45,0.50,0.55]
ax.set_ylim(-.020,1.4)
ax.set_yticks(np.arange(0,1.6,0.2))
# ax.set_yticks(ytic)
# ax.set_yticklabels([str(i) for i in ytic])
xlabeles=[0.2,0.3,0.4,0.5,0.6,0.7,0.8]
print(xlabeles)
for ax in fig.get_axes():
    ax.set_xticks(range(0,7))
    ax.set_xticklabels([str(i) for i in xlabeles])
    ax.set_xlabel('Load')
    ax.set_ylabel('Average Throughput (ms)')
    

fig.tight_layout() 
name='avgThroughput-dataMining'
plt.savefig('%s.pdf'%name,format="pdf", bbox_inches='tight', pad_inches=0.05)
plt.close()

'''
#******************************** all_Throughput small*************************************
set_paper_rcs()

fig,ax = plt.subplots(nrows=1, ncols=1)

ax.plot((RIFO_all_Throughput),label='RIFO' ,color=RIFO_color,linestyle='-', mfc='tab:red',marker='d', markersize=3,lw=1,  mew=0.65)
ax.plot((AIFO_all_Throughput),label='AIFO' ,color=AIFO_color,linestyle='-', mfc='tab:blue',marker='s', markersize=3,lw=1 ,  mew=0.65)
ax.plot((SPPIFO_all_Throughput),label='SP-PIFO' ,color=SPPIFO_color,linestyle='-', mfc='tab:orange',marker='o', markersize=3,lw=1 ,  mew=0.65)
ax.plot((PIFO_all_Throughput),label='PIFO' ,color=PIFO_color,linestyle='-', mfc='tab:green',marker='X', markersize=3,lw=1 ,  mew=0.65)
ax.plot((DCTCP_all_Throughput),label='DCTCP' ,color=DCTCP_color,linestyle='-', mfc='tab:purple',marker='^', markersize=3,lw=1 ,  mew=0.65)
ax.plot((TCP_all_Throughput),label='TCP' ,color=TCP_color,linestyle='-', mfc='tab:olive',marker='v', markersize=3,lw=1 ,  mew=0.65)


ax.grid(color='black', ls = '--',dashes=(5, 15), lw = 0.2,alpha=1)
# legend =plt.legend(bbox_to_anchor=(0.95, 1.05),loc="best",numpoints=2, frameon=True, ncol=3, columnspacing=0.8, handletextpad=0.2)
legend =plt.legend(loc="best",numpoints=2, frameon=True, ncol=3, columnspacing=0.8, handletextpad=0.2)

# ytic=[2.5,3.0,3.5,4.0,4.5]
# ax.set_ylim(2.5,4.5)
# ax.set_yticks(ytic)
# ax.set_yticklabels([str(i) for i in ytic])
'''
ax.set_yscale('log')
ax.set_ylim(0.1,int(max(FlowCover_Throughputall__FB)))
'''
ax.set_ylim(0,2)
ax.set_yticks(np.arange(0,2.2,0.2))
# ax.title.set_text('Flow size (0, 100KB)')
for ax in fig.get_axes():
    ax.set_xticks(range(0,7))
    ax.set_xticklabels([str(i) for i in xlabeles])
    ax.set_xlabel('Load')
    ax.set_ylabel('Average throughput (Gbps)')    

fig.tight_layout() 
name='Throughput-all-dataMining'
plt.savefig('%s.pdf'%name,format="pdf", bbox_inches='tight', pad_inches=0.05)
plt.close()
'''
#**************************Large********************************************
set_paper_rcs()

fig,ax = plt.subplots(nrows=1, ncols=1)
ax.plot((RIFO_large),label='RIFO' ,color=RIFO_color,linestyle='-', mfc='tab:red',marker='d', markersize=3,lw=1 ,  mew=0.65)
ax.plot((AIFO_large),label='AIFO' ,color=AIFO_color,linestyle='-', mfc='tab:blue',marker='s', markersize=3,lw=1 ,  mew=0.65)
ax.plot((SPPIFO_large),label='SP-PIFO' ,color=SPPIFO_color,linestyle='-', mfc='tab:orange',marker='o', markersize=3,lw=1 ,  mew=0.65)
ax.plot((PIFO_large),label='PIFO' ,color=PIFO_color,linestyle='-', mfc='tab:green',marker='X', markersize=3,lw=1 ,  mew=0.65)
ax.plot((DCTCP_large),label='DCTCP' ,color=DCTCP_color,linestyle='-', mfc='tab:purple',marker='^', markersize=3,lw=1 ,  mew=0.65)
ax.plot((TCP_large),label='TCP' ,color=TCP_color,linestyle='-', mfc='tab:olive',marker='v', markersize=3,lw=1 ,  mew=0.65)


# ax.title.set_text('Large flows')
# legend =plt.legend(loc="best",numpoints=2, frameon=False, ncol=1, columnspacing=0.8, handletextpad=0.2)
legend =plt.legend(loc="best",numpoints=2, frameon=True, ncol=3, columnspacing=0.8, handletextpad=0.2)

ax.set_ylim(0,180)
ax.set_yticks(range(0,200,20))
'''
'''
ax.set_ylim(0,700)
ax.set_yticks(range(0,800,100))
ax.set_yticklabels([str(i) for i in range(0,800,100)], fontsize=11)

ax.set_yscale('log')
ax.set_ylim(1000,int(max(FlowCover_avgThroughputLarge_FB)))
'''
'''
for ax in fig.get_axes():
    ax.set_xticks(range(0,7))
    ax.set_xticklabels([str(i) for i in xlabeles])
    ax.set_xlabel('Load')
    ax.set_ylabel('Average Throughput (ms)')
       
ax.grid(color='black', ls = '--',dashes=(5, 15), lw = 0.2,alpha=1)
fig.tight_layout() 
name='avgThroughputLarge-dataMining'
plt.savefig('%s.pdf'%name,format="pdf", bbox_inches='tight', pad_inches=0.05)
plt.close()
'''

