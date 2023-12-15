---
title: signatures.sdf3
hide:
  - toc
---

# `signatures.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/gradual-types/signatures.sdf3]

[pdmosses/stratego/stratego.lang/syntax/gradual-types/signatures.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/gradual-types/signatures.sdf3 "The source file on GitHub"

<div class="sdf3"><table class="highlighttable"><tbody><tr><td class="linenos"><div class="linenodiv"><pre><span></span>1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="gradual-types/signatures_1_8" title="Multi-file references" data-urls="../internal.sdf3/#gradual-types/signatures_8_3 line 8; ../main.sdf3/#gradual-types/signatures_5_3 line 5; ../modules.sdf3/#gradual-types/signatures_5_3 line 5; ../overlays.sdf3/#gradual-types/signatures_5_3 line 5; ../strategies.sdf3/#gradual-types/signatures_4_3 line 4; ../terms.sdf3/#gradual-types/signatures_5_3 line 5; ../../deduplicated.sdf3/#gradual-types/signatures_14_3 line 14">gradual-types/signatures</button>

<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_4_3" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/signatures.sdf3/#core/signatures_1_8" id="core/signatures_5_3" title="Defined at ../../core/signatures.sdf3 line 1">core/signatures</a>

<span class="keyword">context-free sorts</span> <button class="modal-open" id="Type_7_20" title="Multi-file references" data-urls="#Type_11_25 line 11, 17, 19, 28, 29, 30, 38, 44; ../modules.sdf3/#Type_11_53 line 11; ../overlays.sdf3/#Type_13_13 line 13; ../strategies.sdf3/#Type_18_30 line 18, 23; ../terms.sdf3/#Type_9_37 line 9; ../../deduplicated.sdf3/#Type_73_30 line 73">Type</button> <a href="#SortT_18_23" id="SortT_7_25" title="Referenced at line 18">SortT</a> <button class="modal-open" id="Dyn_7_31" title="Multi-file references" data-urls="#Dyn_9_25 line 9, 12, 25; ../../deduplicated.sdf3/#Dyn_71_20 line 71, 78">Dyn</button>
<span class="keyword">context-free syntax</span>
  <span id="ConstType_9_3" title="Not referenced">ConstType</span>.<span class="cons_Constructor"><span id="ConstDynT_9_13" title="Not referenced">ConstDynT</span></span> = <a href="#Dyn_7_31" id="Dyn_9_25" title="Defined at line 7, 10">Dyn</a>
  <button class="modal-open" id="Dyn_10_3" title="Multi-file references" data-urls="#Dyn_9_25 line 9, 12, 25; ../../deduplicated.sdf3/#Dyn_71_20 line 71, 78">Dyn</button>.<span class="cons_Constructor"><span id="Dyn_10_7" title="Not referenced">Dyn</span></span>           = [<span class="cons_String">?</span>]
  <button class="modal-open" id="Type_11_3" title="Multi-file references" data-urls="#Type_11_25 line 11, 17, 19, 28, 29, 30, 38, 44; ../modules.sdf3/#Type_11_53 line 11; ../overlays.sdf3/#Type_13_13 line 13; ../strategies.sdf3/#Type_18_30 line 18, 23; ../terms.sdf3/#Type_9_37 line 9; ../../deduplicated.sdf3/#Type_73_30 line 73">Type</button>.<span class="cons_Constructor"><a href="#TupleT_28_8" id="TupleT_11_8" title="Referenced at line 28, 29, 30">TupleT</a></span>       = [[<a href="#Type_7_20" id="Type_11_25" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>] <span class="cons_String">*</span> [{<a href="#Type_7_20" id="Type_11_35" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">" * "</span>}+]]
  <button class="modal-open" id="Type_12_3" title="Multi-file references" data-urls="#Type_11_25 line 11, 17, 19, 28, 29, 30, 38, 44; ../modules.sdf3/#Type_11_53 line 11; ../overlays.sdf3/#Type_13_13 line 13; ../strategies.sdf3/#Type_18_30 line 18, 23; ../terms.sdf3/#Type_9_37 line 9; ../../deduplicated.sdf3/#Type_73_30 line 73">Type</button>.<span class="cons_Constructor"><span id="DynT_12_8" title="Not referenced">DynT</span></span>         = <a href="#Dyn_7_31" id="Dyn_12_23" title="Defined at line 7, 10">Dyn</a>
  <button class="modal-open" id="Type_13_3" title="Multi-file references" data-urls="#Type_11_25 line 11, 17, 19, 28, 29, 30, 38, 44; ../modules.sdf3/#Type_11_53 line 11; ../overlays.sdf3/#Type_13_13 line 13; ../strategies.sdf3/#Type_18_30 line 18, 23; ../terms.sdf3/#Type_9_37 line 9; ../../deduplicated.sdf3/#Type_73_30 line 73">Type</button>.<span class="cons_Constructor"><span id="StringT_13_8" title="Not referenced">StringT</span></span>      = <span class="cons_Lit">"string"</span>
  <button class="modal-open" id="Type_14_3" title="Multi-file references" data-urls="#Type_11_25 line 11, 17, 19, 28, 29, 30, 38, 44; ../modules.sdf3/#Type_11_53 line 11; ../overlays.sdf3/#Type_13_13 line 13; ../strategies.sdf3/#Type_18_30 line 18, 23; ../terms.sdf3/#Type_9_37 line 9; ../../deduplicated.sdf3/#Type_73_30 line 73">Type</button>.<span class="cons_Constructor"><span id="IntT_14_8" title="Not referenced">IntT</span></span>         = <span class="cons_Lit">"int"</span>
  <button class="modal-open" id="Type_15_3" title="Multi-file references" data-urls="#Type_11_25 line 11, 17, 19, 28, 29, 30, 38, 44; ../modules.sdf3/#Type_11_53 line 11; ../overlays.sdf3/#Type_13_13 line 13; ../strategies.sdf3/#Type_18_30 line 18, 23; ../terms.sdf3/#Type_9_37 line 9; ../../deduplicated.sdf3/#Type_73_30 line 73">Type</button>.<span class="cons_Constructor"><span id="RealT_15_8" title="Not referenced">RealT</span></span>        = <span class="cons_Lit">"real"</span>
  <button class="modal-open" id="Type_16_3" title="Multi-file references" data-urls="#Type_11_25 line 11, 17, 19, 28, 29, 30, 38, 44; ../modules.sdf3/#Type_11_53 line 11; ../overlays.sdf3/#Type_13_13 line 13; ../strategies.sdf3/#Type_18_30 line 18, 23; ../terms.sdf3/#Type_9_37 line 9; ../../deduplicated.sdf3/#Type_73_30 line 73">Type</button>.<span class="cons_Constructor"><span id="BlobT_16_8" title="Not referenced">BlobT</span></span>        = <span class="cons_Lit">"blob"</span>
  <button class="modal-open" id="Type_17_3" title="Multi-file references" data-urls="#Type_11_25 line 11, 17, 19, 28, 29, 30, 38, 44; ../modules.sdf3/#Type_11_53 line 11; ../overlays.sdf3/#Type_13_13 line 13; ../strategies.sdf3/#Type_18_30 line 18, 23; ../terms.sdf3/#Type_9_37 line 9; ../../deduplicated.sdf3/#Type_73_30 line 73">Type</button>              = [<span class="cons_String">(</span>[<a href="#Type_7_20" id="Type_17_26" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>]<span class="cons_String">)</span>] {<span class="keyword">bracket</span>}
  <button class="modal-open" id="Type_18_3" title="Multi-file references" data-urls="#Type_11_25 line 11, 17, 19, 28, 29, 30, 38, 44; ../modules.sdf3/#Type_11_53 line 11; ../overlays.sdf3/#Type_13_13 line 13; ../strategies.sdf3/#Type_18_30 line 18, 23; ../terms.sdf3/#Type_9_37 line 9; ../../deduplicated.sdf3/#Type_73_30 line 73">Type</button>              = <a href="#SortT_7_25" id="SortT_18_23" title="Defined at line 7, 19, 20, 21, 22">SortT</a>
  <a href="#SortT_18_23" id="SortT_19_3" title="Referenced at line 18">SortT</a>.<span class="cons_Constructor"><span id="SortT_19_9" title="Not referenced">SortT</span></span>       = [[<a href="../../core/identifiers.sdf3/#Id_16_15" id="Id_19_25" title="Defined at ../../core/identifiers.sdf3 line 16, 21, 23, 43, 44, 45">Id</a>]<span class="cons_String">(</span>[{<a href="#Type_7_20" id="Type_19_31" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>]
  <a href="#SortT_18_23" id="SortT_20_3" title="Referenced at line 18">SortT</a>.<span class="cons_Constructor"><span id="SortTNoArgs_20_9" title="Not referenced">SortTNoArgs</span></span> = <a href="../../core/identifiers.sdf3/#UCID_16_27" id="UCID_20_23" title="Defined at ../../core/identifiers.sdf3 line 16, 26, 48">UCID</a>
  <a href="#SortT_18_23" id="SortT_21_3" title="Referenced at line 18">SortT</a>             = <span class="cons_Lit">"TP"</span> {<span class="keyword">reject</span>}
  <a href="#SortT_18_23" id="SortT_22_3" title="Referenced at line 18">SortT</a>.<span class="cons_Constructor"><span id="SortTVar_22_9" title="Not referenced">SortTVar</span></span>    = <a href="../../core/identifiers.sdf3/#SortVar_16_32" id="SortVar_22_23" title="Defined at ../../core/identifiers.sdf3 line 16, 28, 29">SortVar</a>

  <span id="SortArg_24_3" title="Not referenced">SortArg</span>.<span class="cons_Constructor"><span id="SATupleT_24_11" title="Not referenced">SATupleT</span></span> = [[<a href="../../core/signatures.sdf3/#Sort_31_20" id="Sort_24_24" title="Defined at ../../core/signatures.sdf3 line 31, 33, 34, 35">Sort</a>] <span class="cons_String">*</span> [{<a href="../../core/signatures.sdf3/#Sort_31_20" id="Sort_24_34" title="Defined at ../../core/signatures.sdf3 line 31, 33, 34, 35">Sort</a> <span class="cons_Lit">" * "</span>}+]]
  <span id="SortArg_25_3" title="Not referenced">SortArg</span>.<span class="cons_Constructor"><span id="SADynT_25_11" title="Not referenced">SADynT</span></span>   = <a href="#Dyn_7_31" id="Dyn_25_22" title="Defined at line 7, 10">Dyn</a>

<span class="keyword">context-free priorities</span>
  <a href="#Type_7_20" id="Type_28_3" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>.<span class="cons_Constructor"><a href="#TupleT_11_8" id="TupleT_28_8" title="Defined at line 11">TupleT</a></span> &lt;0&gt; .&gt; <a href="#Type_7_20" id="Type_28_22" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>.<span class="cons_Constructor"><a href="#TupleT_11_8" id="TupleT_28_27" title="Defined at line 11">TupleT</a></span>,
  {<a href="#Type_7_20" id="Type_29_4" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">"*"</span>}+ = <a href="#Type_7_20" id="Type_29_17" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> &lt;0&gt; .&gt; <a href="#Type_7_20" id="Type_29_29" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>.<span class="cons_Constructor"><a href="#TupleT_11_8" id="TupleT_29_34" title="Defined at line 11">TupleT</a></span>,
  {<a href="#Type_7_20" id="Type_30_4" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">"*"</span>}+ = {<a href="#Type_7_20" id="Type_30_18" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">"*"</span>}+ <span class="cons_Lit">"*"</span> <a href="#Type_7_20" id="Type_30_33" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> &lt;2&gt; .&gt; <a href="#Type_7_20" id="Type_30_45" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>.<span class="cons_Constructor"><a href="#TupleT_11_8" id="TupleT_30_50" title="Defined at line 11">TupleT</a></span>

<span class="keyword">context-free sorts</span> <button class="modal-open" id="SType_32_20" title="Multi-file references" data-urls="#SType_41_27 line 41, 44; ../modules.sdf3/#SType_10_35 line 10, 11; ../strategies.sdf3/#SType_27_29 line 27; ../../deduplicated.sdf3/#SType_80_26 line 80">SType</button> <button class="modal-open" id="SFunType_32_26" title="Multi-file references" data-urls="#SFunType_35_28 line 35; ../internal.sdf3/#SFunType_39_31 line 39, 63, 64">SFunType</button> <button class="modal-open" id="SSimpleFunType_32_35" title="Multi-file references" data-urls="#SSimpleFunType_40_23 line 40, 41, 44; ../modules.sdf3/#SSimpleFunType_9_37 line 9, 10, 11; ../../deduplicated.sdf3/#SSimpleFunType_80_42 line 80">SSimpleFunType</button> <button class="modal-open" id="FunTType_32_50" title="Multi-file references" data-urls="#FunTType_42_23 line 42; ../strategies.sdf3/#FunTType_41_35 line 41, 44">FunTType</button>
<span class="keyword">context-free syntax</span>
  <button class="modal-open" id="SType_34_3" title="Multi-file references" data-urls="#SType_41_27 line 41, 44; ../modules.sdf3/#SType_10_35 line 10, 11; ../strategies.sdf3/#SType_27_29 line 27; ../../deduplicated.sdf3/#SType_80_26 line 80">SType</button>.<span class="cons_Constructor"><span id="SDyn_34_9" title="Not referenced">SDyn</span></span>             = [<span class="cons_String">?</span>]
  <button class="modal-open" id="SType_35_3" title="Multi-file references" data-urls="#SType_41_27 line 41, 44; ../modules.sdf3/#SType_10_35 line 10, 11; ../strategies.sdf3/#SType_27_29 line 27; ../../deduplicated.sdf3/#SType_80_26 line 80">SType</button>                  = <a href="#SFunType_32_26" id="SFunType_35_28" title="Defined at line 32, 40, 41, 42">SFunType</a>

  <button class="modal-open" id="SSimpleFunType_37_3" title="Multi-file references" data-urls="#SSimpleFunType_40_23 line 40, 41, 44; ../modules.sdf3/#SSimpleFunType_9_37 line 9, 10, 11; ../../deduplicated.sdf3/#SSimpleFunType_80_42 line 80">SSimpleFunType</button>.<span class="cons_Constructor"><span id="TP_37_18" title="Not referenced">TP</span></span>                 = [<span class="cons_String">TP</span>]
  <button class="modal-open" id="SSimpleFunType_38_3" title="Multi-file references" data-urls="#SSimpleFunType_40_23 line 40, 41, 44; ../modules.sdf3/#SSimpleFunType_9_37 line 9, 10, 11; ../../deduplicated.sdf3/#SSimpleFunType_80_42 line 80">SSimpleFunType</button>.<span class="cons_Constructor"><span id="FunNoArgsType_38_18" title="Not referenced">FunNoArgsType</span></span>      = [[<a href="#Type_7_20" id="Type_38_41" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>] <span class="cons_String">-&gt;</span> [<a href="#Type_7_20" id="Type_38_51" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>]]

  <button class="modal-open" id="SFunType_40_3" title="Multi-file references" data-urls="#SFunType_35_28 line 35; ../internal.sdf3/#SFunType_39_31 line 39, 63, 64">SFunType</button>          = <a href="#SSimpleFunType_32_35" id="SSimpleFunType_40_23" title="Defined at line 32, 37, 38">SSimpleFunType</a>
  <button class="modal-open" id="SFunType_41_3" title="Multi-file references" data-urls="#SFunType_35_28 line 35; ../internal.sdf3/#SFunType_39_31 line 39, 63, 64">SFunType</button>.<span class="cons_Constructor"><span id="SFunType_41_12" title="Not referenced">SFunType</span></span> = [<span class="cons_String">(</span>[{<a href="#SType_32_20" id="SType_41_27" title="Defined at line 32, 34, 35">SType</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> [<a href="#SSimpleFunType_32_35" id="SSimpleFunType_41_43" title="Defined at line 32, 37, 38">SSimpleFunType</a>]]
  <button class="modal-open" id="SFunType_42_3" title="Multi-file references" data-urls="#SFunType_35_28 line 35; ../internal.sdf3/#SFunType_39_31 line 39, 63, 64">SFunType</button>          = <a href="#FunTType_32_50" id="FunTType_42_23" title="Defined at line 32, 44">FunTType</a>

  <button class="modal-open" id="FunTType_44_3" title="Multi-file references" data-urls="#FunTType_42_23 line 42; ../strategies.sdf3/#FunTType_41_35 line 41, 44">FunTType</button>.<span class="cons_Constructor"><span id="FunTType_44_12" title="Not referenced">FunTType</span></span> = [<span class="cons_String">(</span>[{<a href="#SType_32_20" id="SType_44_27" title="Defined at line 32, 34, 35">SType</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="#Type_7_20" id="Type_44_45" title="Defined at line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> [<a href="#SSimpleFunType_32_35" id="SSimpleFunType_44_60" title="Defined at line 32, 37, 38">SSimpleFunType</a>]]

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
