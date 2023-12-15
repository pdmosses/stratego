---
title: signatures-namespaced.sdf3
hide:
  - toc
---

# `signatures-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/signatures-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/signatures-namespaced.sdf3 "The source file on GitHub"

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
45
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/gradual-types/signatures-namespaced_1_8" title="Multi-file references" data-urls="../internal-namespaced.sdf3/#StrategoLang/gradual-types/signatures-namespaced_8_3 line 8; ../main-namespaced.sdf3/#StrategoLang/gradual-types/signatures-namespaced_5_3 line 5; ../modules-namespaced.sdf3/#StrategoLang/gradual-types/signatures-namespaced_6_3 line 6; ../overlays-namespaced.sdf3/#StrategoLang/gradual-types/signatures-namespaced_6_3 line 6; ../strategies-namespaced.sdf3/#StrategoLang/gradual-types/signatures-namespaced_4_3 line 4; ../terms-namespaced.sdf3/#StrategoLang/gradual-types/signatures-namespaced_6_3 line 6; ../../deduplicated-namespaced.sdf3/#StrategoLang/gradual-types/signatures-namespaced_12_3 line 12">StrategoLang/gradual-types/signatures-namespaced</button>

<span class="keyword">imports</span>
  <a href="../../core/identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_4_3" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/signatures-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_1_8" id="StrategoLang/core/signatures-namespaced_5_3" title="Defined at ../../core/signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>

<span class="keyword">sorts</span> <button class="modal-open" id="StrategoLang-Type_7_7" title="Multi-file references" data-urls="#StrategoLang-Type_13_32 line 13, 19, 21, 30, 31, 32, 41, 45; ../strategies-namespaced.sdf3/#StrategoLang-Type_19_41 line 19, 22; ../terms-namespaced.sdf3/#StrategoLang-Type_10_63 line 10">StrategoLang-Type</button> <a href="#StrategoLang-SortT_20_23" id="StrategoLang-SortT_7_25" title="Referenced at line 20">StrategoLang-SortT</a> <a href="#StrategoLang-Dyn_11_38" id="StrategoLang-Dyn_7_44" title="Referenced at line 11, 14, 26">StrategoLang-Dyn</a>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-ConstType_11_3" title="Not referenced">StrategoLang-ConstType</span>.<span class="cons_Constructor"><span id="ConstDynT_11_26" title="Not referenced">ConstDynT</span></span> = <a href="#StrategoLang-Dyn_7_44" id="StrategoLang-Dyn_11_38" title="Defined at line 7, 12">StrategoLang-Dyn</a> { }
  <a href="#StrategoLang-Dyn_11_38" id="StrategoLang-Dyn_12_3" title="Referenced at line 11, 14, 26">StrategoLang-Dyn</a>.<span class="cons_Constructor"><span id="Dyn_12_20" title="Not referenced">Dyn</span></span> = [<span class="cons_String">?</span>] { }
  <button class="modal-open" id="StrategoLang-Type_13_3" title="Multi-file references" data-urls="#StrategoLang-Type_13_32 line 13, 19, 21, 30, 31, 32, 41, 45; ../strategies-namespaced.sdf3/#StrategoLang-Type_19_41 line 19, 22; ../terms-namespaced.sdf3/#StrategoLang-Type_10_63 line 10">StrategoLang-Type</button>.<span class="cons_Constructor"><a href="#TupleT_30_21" id="TupleT_13_21" title="Referenced at line 30, 31, 32">TupleT</a></span> = [[<a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_13_32" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>] <span class="cons_String">*</span> [{<a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_13_55" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> <span class="cons_Lit">" * "</span>}+]] { }
  <button class="modal-open" id="StrategoLang-Type_14_3" title="Multi-file references" data-urls="#StrategoLang-Type_13_32 line 13, 19, 21, 30, 31, 32, 41, 45; ../strategies-namespaced.sdf3/#StrategoLang-Type_19_41 line 19, 22; ../terms-namespaced.sdf3/#StrategoLang-Type_10_63 line 10">StrategoLang-Type</button>.<span class="cons_Constructor"><span id="DynT_14_21" title="Not referenced">DynT</span></span> = <a href="#StrategoLang-Dyn_7_44" id="StrategoLang-Dyn_14_28" title="Defined at line 7, 12">StrategoLang-Dyn</a> { }
  <button class="modal-open" id="StrategoLang-Type_15_3" title="Multi-file references" data-urls="#StrategoLang-Type_13_32 line 13, 19, 21, 30, 31, 32, 41, 45; ../strategies-namespaced.sdf3/#StrategoLang-Type_19_41 line 19, 22; ../terms-namespaced.sdf3/#StrategoLang-Type_10_63 line 10">StrategoLang-Type</button>.<span class="cons_Constructor"><span id="StringT_15_21" title="Not referenced">StringT</span></span> = <span class="cons_Lit">"string"</span> { }
  <button class="modal-open" id="StrategoLang-Type_16_3" title="Multi-file references" data-urls="#StrategoLang-Type_13_32 line 13, 19, 21, 30, 31, 32, 41, 45; ../strategies-namespaced.sdf3/#StrategoLang-Type_19_41 line 19, 22; ../terms-namespaced.sdf3/#StrategoLang-Type_10_63 line 10">StrategoLang-Type</button>.<span class="cons_Constructor"><span id="IntT_16_21" title="Not referenced">IntT</span></span> = <span class="cons_Lit">"int"</span> { }
  <button class="modal-open" id="StrategoLang-Type_17_3" title="Multi-file references" data-urls="#StrategoLang-Type_13_32 line 13, 19, 21, 30, 31, 32, 41, 45; ../strategies-namespaced.sdf3/#StrategoLang-Type_19_41 line 19, 22; ../terms-namespaced.sdf3/#StrategoLang-Type_10_63 line 10">StrategoLang-Type</button>.<span class="cons_Constructor"><span id="RealT_17_21" title="Not referenced">RealT</span></span> = <span class="cons_Lit">"real"</span> { }
  <button class="modal-open" id="StrategoLang-Type_18_3" title="Multi-file references" data-urls="#StrategoLang-Type_13_32 line 13, 19, 21, 30, 31, 32, 41, 45; ../strategies-namespaced.sdf3/#StrategoLang-Type_19_41 line 19, 22; ../terms-namespaced.sdf3/#StrategoLang-Type_10_63 line 10">StrategoLang-Type</button>.<span class="cons_Constructor"><span id="BlobT_18_21" title="Not referenced">BlobT</span></span> = <span class="cons_Lit">"blob"</span> { }
  <button class="modal-open" id="StrategoLang-Type_19_3" title="Multi-file references" data-urls="#StrategoLang-Type_13_32 line 13, 19, 21, 30, 31, 32, 41, 45; ../strategies-namespaced.sdf3/#StrategoLang-Type_19_41 line 19, 22; ../terms-namespaced.sdf3/#StrategoLang-Type_10_63 line 10">StrategoLang-Type</button> = [<span class="cons_String">(</span>[<a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_19_26" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>]<span class="cons_String">)</span>] {<span class="keyword">bracket</span>}
  <button class="modal-open" id="StrategoLang-Type_20_3" title="Multi-file references" data-urls="#StrategoLang-Type_13_32 line 13, 19, 21, 30, 31, 32, 41, 45; ../strategies-namespaced.sdf3/#StrategoLang-Type_19_41 line 19, 22; ../terms-namespaced.sdf3/#StrategoLang-Type_10_63 line 10">StrategoLang-Type</button> = <a href="#StrategoLang-SortT_7_25" id="StrategoLang-SortT_20_23" title="Defined at line 7, 21, 22, 23, 24">StrategoLang-SortT</a> { }
  <a href="#StrategoLang-SortT_20_23" id="StrategoLang-SortT_21_3" title="Referenced at line 20">StrategoLang-SortT</a>.<span class="cons_Constructor"><span id="SortT_21_22" title="Not referenced">SortT</span></span> = [[<a href="../../core/identifiers-namespaced.sdf3/#StrategoLang-Id_27_3" id="StrategoLang-Id_21_32" title="Defined at ../../core/identifiers-namespaced.sdf3 line 27, 29, 49, 50, 51">StrategoLang-Id</a>]<span class="cons_String">(</span>[{<a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_21_51" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span>] { }
  <a href="#StrategoLang-SortT_20_23" id="StrategoLang-SortT_22_3" title="Referenced at line 20">StrategoLang-SortT</a>.<span class="cons_Constructor"><span id="SortTNoArgs_22_22" title="Not referenced">SortTNoArgs</span></span> = <a href="../../core/identifiers-namespaced.sdf3/#StrategoLang-UCID_31_3" id="StrategoLang-UCID_22_36" title="Defined at ../../core/identifiers-namespaced.sdf3 line 31, 54">StrategoLang-UCID</a> { }
  <a href="#StrategoLang-SortT_20_23" id="StrategoLang-SortT_23_3" title="Referenced at line 20">StrategoLang-SortT</a> = <span class="cons_Lit">"TP"</span> {<span class="keyword">reject</span>}
  <a href="#StrategoLang-SortT_20_23" id="StrategoLang-SortT_24_3" title="Referenced at line 20">StrategoLang-SortT</a>.<span class="cons_Constructor"><span id="SortTVar_24_22" title="Not referenced">SortTVar</span></span> = <a href="../../core/identifiers-namespaced.sdf3/#StrategoLang-SortVar_32_3" id="StrategoLang-SortVar_24_33" title="Defined at ../../core/identifiers-namespaced.sdf3 line 32, 33">StrategoLang-SortVar</a> { }
  <span id="StrategoLang-SortArg_25_3" title="Not referenced">StrategoLang-SortArg</span>.<span class="cons_Constructor"><span id="SATupleT_25_24" title="Not referenced">SATupleT</span></span> = [[<a href="../../core/signatures-namespaced.sdf3/#StrategoLang-Sort_32_7" id="StrategoLang-Sort_25_37" title="Defined at ../../core/signatures-namespaced.sdf3 line 32, 36, 37, 38">StrategoLang-Sort</a>] <span class="cons_String">*</span> [{<a href="../../core/signatures-namespaced.sdf3/#StrategoLang-Sort_32_7" id="StrategoLang-Sort_25_60" title="Defined at ../../core/signatures-namespaced.sdf3 line 32, 36, 37, 38">StrategoLang-Sort</a> <span class="cons_Lit">" * "</span>}+]] { }
  <span id="StrategoLang-SortArg_26_3" title="Not referenced">StrategoLang-SortArg</span>.<span class="cons_Constructor"><span id="SADynT_26_24" title="Not referenced">SADynT</span></span> = <a href="#StrategoLang-Dyn_7_44" id="StrategoLang-Dyn_26_33" title="Defined at line 7, 12">StrategoLang-Dyn</a> { }

<span class="keyword">context-free priorities</span>

  <a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_30_3" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>.<span class="cons_Constructor"><a href="#TupleT_13_21" id="TupleT_30_21" title="Defined at line 13">TupleT</a></span> &lt;0&gt;. &gt; <a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_30_35" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>.<span class="cons_Constructor"><a href="#TupleT_13_21" id="TupleT_30_53" title="Defined at line 13">TupleT</a></span>,
  {<a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_31_4" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> <span class="cons_Lit">"*"</span>}+ = <a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_31_30" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> { } &lt;0&gt;. &gt; <a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_31_59" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>.<span class="cons_Constructor"><a href="#TupleT_13_21" id="TupleT_31_77" title="Defined at line 13">TupleT</a></span>,
  {<a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_32_4" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> <span class="cons_Lit">"*"</span>}+ = {<a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_32_31" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> <span class="cons_Lit">"*"</span>}+ <span class="cons_Lit">"*"</span> <a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_32_59" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> { } &lt;2&gt;. &gt; <a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_32_88" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>.<span class="cons_Constructor"><a href="#TupleT_13_21" id="TupleT_32_106" title="Defined at line 13">TupleT</a></span>

<span class="keyword">sorts</span> <button class="modal-open" id="StrategoLang-SType_34_7" title="Multi-file references" data-urls="#StrategoLang-SType_43_40 line 43, 45; ../strategies-namespaced.sdf3/#StrategoLang-SType_25_42 line 25">StrategoLang-SType</button> <a href="#StrategoLang-SFunType_39_24" id="StrategoLang-SFunType_34_26" title="Referenced at line 39">StrategoLang-SFunType</a> <a href="#StrategoLang-SSimpleFunType_42_27" id="StrategoLang-SSimpleFunType_34_48" title="Referenced at line 42, 43, 45">StrategoLang-SSimpleFunType</a> <button class="modal-open" id="StrategoLang-FunTType_34_76" title="Multi-file references" data-urls="#StrategoLang-FunTType_44_27 line 44; ../strategies-namespaced.sdf3/#StrategoLang-FunTType_35_85 line 35, 36">StrategoLang-FunTType</button>

<span class="keyword">context-free syntax</span>

  <button class="modal-open" id="StrategoLang-SType_38_3" title="Multi-file references" data-urls="#StrategoLang-SType_43_40 line 43, 45; ../strategies-namespaced.sdf3/#StrategoLang-SType_25_42 line 25">StrategoLang-SType</button>.<span class="cons_Constructor"><span id="SDyn_38_22" title="Not referenced">SDyn</span></span> = [<span class="cons_String">?</span>] { }
  <button class="modal-open" id="StrategoLang-SType_39_3" title="Multi-file references" data-urls="#StrategoLang-SType_43_40 line 43, 45; ../strategies-namespaced.sdf3/#StrategoLang-SType_25_42 line 25">StrategoLang-SType</button> = <a href="#StrategoLang-SFunType_34_26" id="StrategoLang-SFunType_39_24" title="Defined at line 34, 42, 43, 44">StrategoLang-SFunType</a> { }
  <a href="#StrategoLang-SSimpleFunType_42_27" id="StrategoLang-SSimpleFunType_40_3" title="Referenced at line 42, 43, 45">StrategoLang-SSimpleFunType</a>.<span class="cons_Constructor"><span id="TP_40_31" title="Not referenced">TP</span></span> = [<span class="cons_String">TP</span>] { }
  <a href="#StrategoLang-SSimpleFunType_42_27" id="StrategoLang-SSimpleFunType_41_3" title="Referenced at line 42, 43, 45">StrategoLang-SSimpleFunType</a>.<span class="cons_Constructor"><span id="FunNoArgsType_41_31" title="Not referenced">FunNoArgsType</span></span> = [[<a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_41_49" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>] <span class="cons_String">-&gt;</span> [<a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_41_72" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>]] { }
  <a href="#StrategoLang-SFunType_39_24" id="StrategoLang-SFunType_42_3" title="Referenced at line 39">StrategoLang-SFunType</a> = <a href="#StrategoLang-SSimpleFunType_34_48" id="StrategoLang-SSimpleFunType_42_27" title="Defined at line 34, 40, 41">StrategoLang-SSimpleFunType</a> { }
  <a href="#StrategoLang-SFunType_39_24" id="StrategoLang-SFunType_43_3" title="Referenced at line 39">StrategoLang-SFunType</a>.<span class="cons_Constructor"><span id="SFunType_43_25" title="Not referenced">SFunType</span></span> = [<span class="cons_String">(</span>[{<a href="#StrategoLang-SType_34_7" id="StrategoLang-SType_43_40" title="Defined at line 34, 38, 39">StrategoLang-SType</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> [<a href="#StrategoLang-SSimpleFunType_34_48" id="StrategoLang-SSimpleFunType_43_69" title="Defined at line 34, 40, 41">StrategoLang-SSimpleFunType</a>]] { }
  <a href="#StrategoLang-SFunType_39_24" id="StrategoLang-SFunType_44_3" title="Referenced at line 39">StrategoLang-SFunType</a> = <a href="#StrategoLang-FunTType_34_76" id="StrategoLang-FunTType_44_27" title="Defined at line 34, 45">StrategoLang-FunTType</a> { }
  <button class="modal-open" id="StrategoLang-FunTType_45_3" title="Multi-file references" data-urls="#StrategoLang-FunTType_44_27 line 44; ../strategies-namespaced.sdf3/#StrategoLang-FunTType_35_85 line 35, 36">StrategoLang-FunTType</button>.<span class="cons_Constructor"><span id="FunTType_45_25" title="Not referenced">FunTType</span></span> = [<span class="cons_String">(</span>[{<a href="#StrategoLang-SType_34_7" id="StrategoLang-SType_45_40" title="Defined at line 34, 38, 39">StrategoLang-SType</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="#StrategoLang-Type_7_7" id="StrategoLang-Type_45_71" title="Defined at line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> [<a href="#StrategoLang-SSimpleFunType_34_48" id="StrategoLang-SSimpleFunType_45_99" title="Defined at line 34, 40, 41">StrategoLang-SSimpleFunType</a>]] { }

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
