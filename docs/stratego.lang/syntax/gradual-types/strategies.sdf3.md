---
title: strategies.sdf3
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
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main.sdf3#gradual-types/strategies_88_112" id="gradual-types/strategies_7_31" title="Referenced at ../main.sdf3 line 6">gradual-types/strategies</a>

<span class="keyword">imports</span>
  <a href="../signatures.sdf3#gradual-types/signatures_7_31" id="gradual-types/signatures_43_67" title="Defined at ../signatures.sdf3 line 1">gradual-types/signatures</a>
  <a href="../../core/identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_70_86" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/strategies.sdf3#core/strategies_7_22" id="core/strategies_89_104" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../../core/terms.sdf3#core/terms_7_17" id="core/terms_107_117" title="Defined at ../../core/terms.sdf3 line 1">core/terms</a>

<span class="keyword">template options</span>
  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <span class="keyword">tokenize</span>: ")(|"


<span class="keyword">context-free sorts</span> <a href="#Coercion_802_810" id="Coercion_207_215" title="Referenced at line 33">Coercion</a> <a href="#SCoercion_749_758" id="SCoercion_216_225" title="Referenced at line 33">SCoercion</a> <a href="#Proxy_660_665" id="Proxy_226_231" title="Referenced at line 31">Proxy</a>
<span class="keyword">context-free syntax</span>
<span class="layout">// Extension for highlighting casts</span>
  <a href="#Strategy_1092_1100" id="Strategy_290_298" title="Referenced at line 45">Strategy</a>.<span class="cons_Constructor"><span id="Cast_299_303" title="Not referenced locally, nor via imports">Cast</span></span>   = [<span class="cons_String">cast(</span>[<a href="#Coercion_207_215" id="Coercion_315_323" title="Defined at line 14, 21, 22, 23">Coercion</a>]<span class="cons_String">)</span>]
  <a href="#Strategy_1092_1100" id="Strategy_329_337" title="Referenced at line 45">Strategy</a>.<span class="cons_Constructor"><span id="TypeTest_338_346" title="Not referenced locally, nor via imports">TypeTest</span></span>   = [<span class="cons_String">is(</span>[<a href="../signatures.sdf3#Type_98_102" id="Type_356_360" title="Defined at ../signatures.sdf3 line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>]<span class="cons_String">)</span>]
<span class="layout">//  Strategy.TypedCong = [[TypedId]([{Strategy ", "}*])]</span>

  <a href="#Coercion_802_810" id="Coercion_424_432" title="Referenced at line 33">Coercion</a>.<span class="cons_Constructor"><span id="FailC_433_438" title="Not referenced locally, nor via imports">FailC</span></span> = [<span class="cons_String">fail</span>]
  <a href="#Coercion_802_810" id="Coercion_450_458" title="Referenced at line 33">Coercion</a>.<span class="cons_Constructor"><span id="IdC_459_462" title="Not referenced locally, nor via imports">IdC</span></span> = [<span class="cons_String">id</span>]
  <a href="#Coercion_802_810" id="Coercion_472_480" title="Referenced at line 33">Coercion</a>.<span class="cons_Constructor"><span id="RuntimeCheck_481_493" title="Not referenced locally, nor via imports">RuntimeCheck</span></span> = <a href="../signatures.sdf3#Type_98_102" id="Type_496_500" title="Defined at ../signatures.sdf3 line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a>

  <a href="#SCoercion_749_758" id="SCoercion_504_513" title="Referenced at line 33">SCoercion</a>.<span class="cons_Constructor"><span id="SFail_514_519" title="Not referenced locally, nor via imports">SFail</span></span>         = [<span class="cons_String">fail</span>]
  <a href="#SCoercion_749_758" id="SCoercion_539_548" title="Referenced at line 33">SCoercion</a>.<span class="cons_Constructor"><span id="SId_549_552" title="Not referenced locally, nor via imports">SId</span></span>           = [<span class="cons_String">id</span>]
  <a href="#SCoercion_749_758" id="SCoercion_572_581" title="Referenced at line 33">SCoercion</a>.<span class="cons_Constructor"><span id="SRuntimeCheck_582_595" title="Not referenced locally, nor via imports">SRuntimeCheck</span></span> = <a href="../signatures.sdf3#SType_838_843" id="SType_598_603" title="Defined at ../signatures.sdf3 line 32, 34, 35">SType</a>

<span class="layout">//  TypedId.TypedId = [[SortT].[Id]]</span>

  <a href="#Strategy_1092_1100" id="Strategy_645_653" title="Referenced at line 45">Strategy</a>     = <a href="#Proxy_226_231" id="Proxy_660_665" title="Defined at line 14, 32, 33">Proxy</a>
  <a href="#Proxy_660_665" id="Proxy_668_673" title="Referenced at line 31">Proxy</a>.<span class="cons_Constructor"><span id="Proxy_674_679" title="Not referenced locally, nor via imports">Proxy</span></span>  = [<span class="cons_String">proxy(</span>[<a href="#Coercion_207_215" id="Coercion_691_699" title="Defined at line 14, 21, 22, 23">Coercion</a>]<span class="cons_String">,</span> [<a href="#Coercion_207_215" id="Coercion_703_711" title="Defined at line 14, 21, 22, 23">Coercion</a>]<span class="cons_String">)(</span>[<a href="#SVar_825_829" id="SVar_715_719" title="Defined at line 35">SVar</a>]<span class="cons_String">)</span>]
  <a href="#Proxy_660_665" id="Proxy_725_730" title="Referenced at line 31">Proxy</a>.<span class="cons_Constructor"><span id="ProxyT_731_737" title="Not referenced locally, nor via imports">ProxyT</span></span> = [<span class="cons_String">proxy(</span>[{<a href="#SCoercion_216_225" id="SCoercion_749_758" title="Defined at line 14, 25, 26, 27">SCoercion</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="#Coercion_207_215" id="Coercion_771_779" title="Defined at line 14, 21, 22, 23">Coercion</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)(</span>[<a href="#Coercion_207_215" id="Coercion_790_798" title="Defined at line 14, 21, 22, 23">Coercion</a>]<span class="cons_String">,</span> [<a href="#Coercion_207_215" id="Coercion_802_810" title="Defined at line 14, 21, 22, 23">Coercion</a>]<span class="cons_String">)(</span>[<a href="#SVar_825_829" id="SVar_814_818" title="Defined at line 35">SVar</a>]<span class="cons_String">)</span>]

  <a href="#SVar_814_818" id="SVar_825_829" title="Referenced at line 33">SVar</a> = <span class="cons_Lit">"cast"</span> {<span class="keyword">reject</span>}

<span class="keyword">context-free sorts</span> <span id="TypedSVar_868_877" title="Not referenced locally, nor via imports">TypedSVar</span> <span id="TypedTVar_878_887" title="Not referenced locally, nor via imports">TypedTVar</span>
<span class="keyword">context-free syntax</span>

  <span id="StrategyDef_911_922" title="Not referenced locally, nor via imports">StrategyDef</span>.<span class="cons_Constructor"><span id="ExtTypedDef_923_934" title="Not referenced locally, nor via imports">ExtTypedDef</span></span> =
    [<span class="cons_String">external</span> [<a href="../../core/strategies.sdf3#MaybeEmptySId_690_703" id="MaybeEmptySId_952_965" title="Defined at ../../core/strategies.sdf3 line 34, 39, 40">MaybeEmptySId</a>] <span class="cons_String">::</span> [<a href="../signatures.sdf3#FunTType_868_876" id="FunTType_971_979" title="Defined at ../signatures.sdf3 line 32, 44">FunTType</a>]]

  <span id="StrategyDef_985_996" title="Not referenced locally, nor via imports">StrategyDef</span>.<span class="cons_Constructor"><span id="ExtTypedDefInl_997_1011" title="Not referenced locally, nor via imports">ExtTypedDefInl</span></span> =
    [<span class="cons_String">external</span> [<a href="../../core/strategies.sdf3#MaybeEmptySId_690_703" id="MaybeEmptySId_1029_1042" title="Defined at ../../core/strategies.sdf3 line 34, 39, 40">MaybeEmptySId</a>]<span class="cons_String">(</span>[{<a href="../../core/terms.sdf3#ID_83_85" id="ID_1046_1048" title="Defined at ../../core/terms.sdf3 line 7, 10">ID</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="../../core/terms.sdf3#ID_83_85" id="ID_1061_1063" title="Defined at ../../core/terms.sdf3 line 7, 10">ID</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [<a href="../signatures.sdf3#FunTType_868_876" id="FunTType_1077_1085" title="Defined at ../signatures.sdf3 line 32, 44">FunTType</a>] <span class="cons_String">=</span>
  [<a href="#Strategy_290_298" id="Strategy_1092_1100" title="Defined at line 17, 18, 31">Strategy</a>]]
</code></pre></td></tr></tbody></table></div>