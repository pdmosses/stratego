---
title: strategies.sdf3
hide:
  - toc
---

# `strategies.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/gradual-types/strategies.sdf3]

[pdmosses/stratego/stratego.lang/syntax/gradual-types/strategies.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/gradual-types/strategies.sdf3 "The source file on GitHub"

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
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="gradual-types/strategies_1_8" title="Multi-file references" data-urls="../main.sdf3/#gradual-types/strategies_6_3 line 6; ../../deduplicated.sdf3/#gradual-types/strategies_15_3 line 15">gradual-types/strategies</button>

<span class="keyword">imports</span>
  <a href="../signatures.sdf3/#gradual-types/signatures_1_8" id="gradual-types/signatures_4_3" title="Defined at ../signatures.sdf3 line 1">gradual-types/signatures</a>
  <a href="../../core/identifiers.sdf3/#core/identifiers_1_8" id="core/identifiers_5_3" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/strategies.sdf3/#core/strategies_1_8" id="core/strategies_6_3" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../../core/terms.sdf3/#core/terms_1_8" id="core/terms_7_3" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>

<span class="keyword">template options</span>
  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <span class="keyword">tokenize</span>: ")(|"


<span class="keyword">context-free sorts</span> <a href="#Coercion_17_28" id="Coercion_14_20" title="Referenced at line 17, 32, 33">Coercion</a> <a href="#SCoercion_33_27" id="SCoercion_14_29" title="Referenced at line 33">SCoercion</a> <a href="#Proxy_31_18" id="Proxy_14_39" title="Referenced at line 31">Proxy</a>
<span class="keyword">context-free syntax</span>
<span class="layout">// Extension for highlighting casts</span>
  <a href="#Strategy_45_4" id="Strategy_17_3" title="Referenced at line 45">Strategy</a>.<span class="cons_Constructor"><span id="Cast_17_12" title="Not referenced">Cast</span></span>   = [<span class="cons_String">cast(</span>[<a href="#Coercion_14_20" id="Coercion_17_28" title="Defined at line 14, 21, 22, 23">Coercion</a>]<span class="cons_String">)</span>]
  <a href="#Strategy_45_4" id="Strategy_18_3" title="Referenced at line 45">Strategy</a>.<span class="cons_Constructor"><span id="TypeTest_18_12" title="Not referenced">TypeTest</span></span>   = [<span class="cons_String">is(</span>[<a href="../signatures.sdf3/#Type_7_20" id="Type_18_30" title="Defined at ../signatures.sdf3 line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>]<span class="cons_String">)</span>]
<span class="layout">//  Strategy.TypedCong = [[TypedId]([{Strategy ", "}*])]</span>

  <a href="#Coercion_17_28" id="Coercion_21_3" title="Referenced at line 17, 32, 33">Coercion</a>.<span class="cons_Constructor"><span id="FailC_21_12" title="Not referenced">FailC</span></span> = [<span class="cons_String">fail</span>]
  <a href="#Coercion_17_28" id="Coercion_22_3" title="Referenced at line 17, 32, 33">Coercion</a>.<span class="cons_Constructor"><span id="IdC_22_12" title="Not referenced">IdC</span></span> = [<span class="cons_String">id</span>]
  <a href="#Coercion_17_28" id="Coercion_23_3" title="Referenced at line 17, 32, 33">Coercion</a>.<span class="cons_Constructor"><span id="RuntimeCheck_23_12" title="Not referenced">RuntimeCheck</span></span> = <a href="../signatures.sdf3/#Type_7_20" id="Type_23_27" title="Defined at ../signatures.sdf3 line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>

  <a href="#SCoercion_33_27" id="SCoercion_25_3" title="Referenced at line 33">SCoercion</a>.<span class="cons_Constructor"><span id="SFail_25_13" title="Not referenced">SFail</span></span>         = [<span class="cons_String">fail</span>]
  <a href="#SCoercion_33_27" id="SCoercion_26_3" title="Referenced at line 33">SCoercion</a>.<span class="cons_Constructor"><span id="SId_26_13" title="Not referenced">SId</span></span>           = [<span class="cons_String">id</span>]
  <a href="#SCoercion_33_27" id="SCoercion_27_3" title="Referenced at line 33">SCoercion</a>.<span class="cons_Constructor"><span id="SRuntimeCheck_27_13" title="Not referenced">SRuntimeCheck</span></span> = <a href="../signatures.sdf3/#SType_32_20" id="SType_27_29" title="Defined at ../signatures.sdf3 line 32, 34, 35">SType</a>

<span class="layout">//  TypedId.TypedId = [[SortT].[Id]]</span>

  <a href="#Strategy_45_4" id="Strategy_31_3" title="Referenced at line 45">Strategy</a>     = <a href="#Proxy_14_39" id="Proxy_31_18" title="Defined at line 14, 32, 33">Proxy</a>
  <a href="#Proxy_31_18" id="Proxy_32_3" title="Referenced at line 31">Proxy</a>.<span class="cons_Constructor"><span id="Proxy_32_9" title="Not referenced">Proxy</span></span>  = [<span class="cons_String">proxy(</span>[<a href="#Coercion_14_20" id="Coercion_32_26" title="Defined at line 14, 21, 22, 23">Coercion</a>]<span class="cons_String">,</span> [<a href="#Coercion_14_20" id="Coercion_32_38" title="Defined at line 14, 21, 22, 23">Coercion</a>]<span class="cons_String">)(</span>[<a href="#SVar_35_3" id="SVar_32_50" title="Defined at line 35">SVar</a>]<span class="cons_String">)</span>]
  <a href="#Proxy_31_18" id="Proxy_33_3" title="Referenced at line 31">Proxy</a>.<span class="cons_Constructor"><span id="ProxyT_33_9" title="Not referenced">ProxyT</span></span> = [<span class="cons_String">proxy(</span>[{<a href="#SCoercion_14_29" id="SCoercion_33_27" title="Defined at line 14, 25, 26, 27">SCoercion</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="#Coercion_14_20" id="Coercion_33_49" title="Defined at line 14, 21, 22, 23">Coercion</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)(</span>[<a href="#Coercion_14_20" id="Coercion_33_68" title="Defined at line 14, 21, 22, 23">Coercion</a>]<span class="cons_String">,</span> [<a href="#Coercion_14_20" id="Coercion_33_80" title="Defined at line 14, 21, 22, 23">Coercion</a>]<span class="cons_String">)(</span>[<a href="#SVar_35_3" id="SVar_33_92" title="Defined at line 35">SVar</a>]<span class="cons_String">)</span>]

  <a href="#SVar_32_50" id="SVar_35_3" title="Referenced at line 32, 33">SVar</a> = <span class="cons_Lit">"cast"</span> {<span class="keyword">reject</span>}

<span class="keyword">context-free sorts</span> <span id="TypedSVar_37_20" title="Not referenced">TypedSVar</span> <span id="TypedTVar_37_30" title="Not referenced">TypedTVar</span>
<span class="keyword">context-free syntax</span>

  <span id="StrategyDef_40_3" title="Not referenced">StrategyDef</span>.<span class="cons_Constructor"><span id="ExtTypedDef_40_15" title="Not referenced">ExtTypedDef</span></span> =
    [<span class="cons_String">external</span> [<a href="../../core/strategies.sdf3/#MaybeEmptySId_34_19" id="MaybeEmptySId_41_16" title="Defined at ../../core/strategies.sdf3 line 34, 39, 40">MaybeEmptySId</a>] <span class="cons_String">::</span> [<a href="../signatures.sdf3/#FunTType_32_50" id="FunTType_41_35" title="Defined at ../signatures.sdf3 line 32, 44">FunTType</a>]]

  <span id="StrategyDef_43_3" title="Not referenced">StrategyDef</span>.<span class="cons_Constructor"><span id="ExtTypedDefInl_43_15" title="Not referenced">ExtTypedDefInl</span></span> =
    [<span class="cons_String">external</span> [<a href="../../core/strategies.sdf3/#MaybeEmptySId_34_19" id="MaybeEmptySId_44_16" title="Defined at ../../core/strategies.sdf3 line 34, 39, 40">MaybeEmptySId</a>]<span class="cons_String">(</span>[{<a href="../../core/terms.sdf3/#ID_7_20" id="ID_44_33" title="Defined at ../../core/terms.sdf3 line 7, 10">ID</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="../../core/terms.sdf3/#ID_7_20" id="ID_44_48" title="Defined at ../../core/terms.sdf3 line 7, 10">ID</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [<a href="../signatures.sdf3/#FunTType_32_50" id="FunTType_44_64" title="Defined at ../signatures.sdf3 line 32, 44">FunTType</a>] <span class="cons_String">=</span>
  [<a href="#Strategy_17_3" id="Strategy_45_4" title="Defined at line 17, 18, 31">Strategy</a>]]
</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
