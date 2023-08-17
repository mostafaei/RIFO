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
matplotlib.font_manager._rebuild()

matplotlib.font_manager.findSystemFonts(fontpaths=None, fontext='ttf')
mpl.rcParams['font.family'] = ['serif']
mpl.rcParams['font.serif'] = ['Times New Roman']

set_paper_rcs_Erdos()


RIFO_99FCT=[]
RIFO_mean_FCT=[]

AIFO_99FCT=[]
AIFO_mean_FCT=[]


SPPIFO_99FCT=[]
SPPIFO_mean_FCT=[]

PIFO_99FCT=[]
PIFO_mean_FCT=[]


TCP_99FCT=[]
TCP_mean_FCT=[]

AFQ_99FCT=[]
AFQ_mean_FCT=[]


DCTCP_99FCT=[]
DCTCP_mean_FCT=[]

xlabeles=[]

file = "fairness_split_mean_fct_ms_32.dat"
r = open(file, 'r')
lines = r.readlines()
for i, line in enumerate(lines):
    x=line.split(" ")
    newX=' '.join(x[1:])
    # print(n1ewX)
    l=re.findall("[-+]?[.]?[\d]+(?:,\d\d\d)*[\.]?\d*(?:[eE][-+]?\d+)?", newX[1:])
    #print(i,l)
    if i>0:
        xlabeles.append(x[0])
        TCP_mean_FCT.append(float(l[1]))
        TCP_99FCT.append(float(l[2]))
        DCTCP_mean_FCT.append(float(l[4]))
        DCTCP_99FCT.append(float(l[5]))
        AFQ_mean_FCT.append(float(l[7]))
        AFQ_99FCT.append(float(l[8]))
        SPPIFO_mean_FCT.append(float(l[10]))
        SPPIFO_99FCT.append(float(l[11]))
        PIFO_mean_FCT.append(float(l[13]))
        PIFO_99FCT.append(float(l[14]))
        AIFO_mean_FCT.append(float(l[16]))
        AIFO_99FCT.append(float(l[17]))
        RIFO_mean_FCT.append(float(l[19]))
        RIFO_99FCT.append(float(l[20]))

  
RIFO_color='tab:red'
AIFO_color='tab:blue'
SPPIFO_color='tab:orange'
PIFO_color='tab:green'
DCTCP_color='tab:purple'
TCP_color='tab:olive'
AFQ_color='tab:brown'
smallColor='black'


margin = 0.05
width = (1.-2.*margin)/(len(RIFO_mean_FCT))

x_pos = np.arange(len(RIFO_mean_FCT))
# width=1/len(RIFO_99FCT)

#******************************** avgFCT small*************************************

fig,ax = plt.subplots(nrows=1, ncols=1)

ax.bar(x_pos-width-width-width,(TCP_mean_FCT),yerr=TCP_99FCT,width=width,label='TCP' ,color=TCP_color  ,error_kw=dict(ecolor=TCP_color, lw=1, capsize=1, capthick=1))
ax.bar(x_pos-width-width,(RIFO_mean_FCT),yerr=RIFO_99FCT,width=width,label='RIFO' ,color=RIFO_color  ,error_kw=dict(ecolor=RIFO_color, lw=1, capsize=1, capthick=1))

ax.bar(x_pos-width,(DCTCP_mean_FCT),yerr=DCTCP_99FCT,width=width,label='DCTCP' ,color=DCTCP_color  ,error_kw=dict(ecolor=DCTCP_color, lw=1, capsize=1, capthick=1))

ax.bar(x_pos+0,(AIFO_mean_FCT),yerr=AIFO_99FCT,width=width,label='AIFO' ,color=AIFO_color  ,error_kw=dict(ecolor=AIFO_color, lw=1, capsize=1, capthick=1))
ax.bar(x_pos+width,(SPPIFO_mean_FCT),yerr=SPPIFO_99FCT,width=width,label='SP-PIFO' ,color=SPPIFO_color  ,error_kw=dict(ecolor=SPPIFO_color, lw=1, capsize=1, capthick=1))
ax.bar(x_pos+width+width,(AFQ_mean_FCT),yerr=AFQ_99FCT,width=width,label='AFQ' ,color=AFQ_color  ,error_kw=dict(ecolor=AFQ_color, lw=1, capsize=1, capthick=1))
ax.bar(x_pos+width+width+width,(PIFO_mean_FCT),yerr=PIFO_99FCT,width=width,label='PIFO' ,color=PIFO_color  ,error_kw=dict(ecolor=PIFO_color, lw=1  , capsize=1, capthick=1))


# ax.bar(x_pos+width, (AIFO_mean_FCT),label='AIFO' ,color=AIFO_color,linestyle='-')
# ax.bar((SPPIFO_mean_FCT),label='SP-PIFO' ,color=SPPIFO_color,linestyle='-', mfc='tab:orange',marker='o', markersize=3  ,  mew=0.65)
# ax.bar((PIFO_mean_FCT),label='PIFO' ,color=PIFO_color,linestyle='-', mfc='tab:green',marker='X', markersize=3  ,  mew=0.65)
# ax.bar((DCTCP_mean_FCT),label='DCTCP' ,color=DCTCP_color,linestyle='-', mfc='tab:purple',marker='^', markersize=3  ,  mew=0.65)
# ax.bar((TCP_mean_FCT),label='TCP' ,color=TCP_color,linestyle='-', mfc='tab:olive',marker='v', markersize=3  ,  mew=0.65)
# ax.bar((AFQ_mean_FCT),label='AFQ' ,color=AFQ_color,linestyle='-', mfc='tab:brown',marker='>', markersize=3  ,  mew=0.65)

# ax.grid(color='black', ls = '--',dashes=(5, 15), lw = 0.2,alpha=1)
# legend =plt.legend(bbox_to_1anchor=(1, 1.3),loc="best",numpoints=2, frameon=True, ncol=4, columnspacing=0.8, handletextpad=0.2)
legend =plt.legend(loc="best",numpoints=2, frameon=True, ncol=2, columnspacing=0.8, handletextpad=0.2)

# ax.title.set_text('Flow size (0, 100KB)')
# ytic=[0.35,0.40,0.45,0.50,0.55]

ax.set_yscale('log')
ax.set_ylim(-1,1000)
# ax.set_yticks(np.arange(0,12,2))
# ax.set_yticks(ytic)
# ax.set_yticklabels([str(i) for i in ytic])
r = np.arange(len(xlabeles))
plt.xticks(r, xlabeles, fontsize=7)



for ax in fig.get_axes():
    # ax.set_xticks(range(0,7))
    # ax.set_xticklabels([str(i) for i in xlabeles])
    ax.set_xlabel('Flow size ')
    ax.set_ylabel('FCT (ms)')
    

fig.tight_layout() 
name='avgFCT-datamining-wfq-bar'
plt.savefig('%s.pdf'%name,format="pdf", bbox_inches='tight', pad_inches=0.05)
plt.close()
