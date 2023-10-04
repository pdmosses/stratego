---
title: strategies-namespaced.sdf3
hide:
  - toc
---

# `strategies-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/strategies-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/gradual-types/strategies-namespaced.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main-namespaced.sdf3#StrategoLang/gradual-types/strategies-namespaced_162_210" id="StrategoLang/gradual-types/strategies-namespaced_7_55" title="Referenced at ../main-namespaced.sdf3 line 6">StrategoLang/gradual-types/strategies-namespaced</a>

<span class="keyword">imports</span>
  <a href="../signatures-namespaced.sdf3#StrategoLang/gradual-types/signatures-namespaced_7_55" id="StrategoLang/gradual-types/signatures-namespaced_67_115" title="Defined at ../signatures-namespaced.sdf3 line 1">StrategoLang/gradual-types/signatures-namespaced</a>        
  <a href="../../core/identifiers-namespaced.sdf3#StrategoLang/core/identifiers-namespaced_7_47" id="StrategoLang/core/identifiers-namespaced_119_159" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>        
  <a href="../../core/strategies-namespaced.sdf3#StrategoLang/core/strategies-namespaced_7_46" id="StrategoLang/core/strategies-namespaced_163_202" title="Defined at ../../core/strategies-namespaced.sdf3 line 1">StrategoLang/core/strategies-namespaced</a>        
  <a href="../../core/terms-namespaced.sdf3#StrategoLang/core/terms-namespaced_7_41" id="StrategoLang/core/terms-namespaced_206_240" title="Defined at ../../core/terms-namespaced.sdf3 line 1">StrategoLang/core/terms-namespaced</a>

<span class="keyword">template options</span>

  <span class="keyword">keyword</span> -/- [<span class="cons_Regular">a</span>-<span class="cons_Regular">z</span><span class="cons_Regular">A</span>-<span class="cons_Regular">Z</span><span class="cons_Regular">0</span>-<span class="cons_Regular">9</span>\'\-\_]
  <span class="keyword">tokenize</span> : ")(|"

<span class="keyword">sorts</span> <a href="#StrategoLang-Coercion_1119_1140" id="StrategoLang-Coercion_318_339" title="Referenced at line 28">StrategoLang-Coercion</a> <a href="#StrategoLang-SCoercion_1027_1049" id="StrategoLang-SCoercion_340_362" title="Referenced at line 28">StrategoLang-SCoercion</a> <a href="#StrategoLang-Proxy_853_871" id="StrategoLang-Proxy_363_381" title="Referenced at line 26">StrategoLang-Proxy</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Strategy_1564_1585" id="StrategoLang-Strategy_406_427" title="Referenced at line 37">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="Cast_428_432" title="Not referenced locally, nor via imports">Cast</span></span> = [<span class="cons_String">cast(</span>[<a href="#StrategoLang-Coercion_318_339" id="StrategoLang-Coercion_442_463" title="Defined at line 14, 20, 21, 22">StrategoLang-Coercion</a>]<span class="cons_String">)</span>] { }
  <a href="#StrategoLang-Strategy_1564_1585" id="StrategoLang-Strategy_473_494" title="Referenced at line 37">StrategoLang-Strategy</a>.<span class="cons_Constructor"><span id="TypeTest_495_503" title="Not referenced locally, nor via imports">TypeTest</span></span> = [<span class="cons_String">is(</span>[<a href="../signatures-namespaced.sdf3#StrategoLang-Type_158_175" id="StrategoLang-Type_511_528" title="Defined at ../signatures-namespaced.sdf3 line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a>]<span class="cons_String">)</span>] { }
  <a href="#StrategoLang-Coercion_1119_1140" id="StrategoLang-Coercion_538_559" title="Referenced at line 28">StrategoLang-Coercion</a>.<span class="cons_Constructor"><span id="FailC_560_565" title="Not referenced locally, nor via imports">FailC</span></span> = [<span class="cons_String">fail</span>] { }
  <a href="#StrategoLang-Coercion_1119_1140" id="StrategoLang-Coercion_581_602" title="Referenced at line 28">StrategoLang-Coercion</a>.<span class="cons_Constructor"><span id="IdC_603_606" title="Not referenced locally, nor via imports">IdC</span></span> = [<span class="cons_String">id</span>] { }
  <a href="#StrategoLang-Coercion_1119_1140" id="StrategoLang-Coercion_620_641" title="Referenced at line 28">StrategoLang-Coercion</a>.<span class="cons_Constructor"><span id="RuntimeCheck_642_654" title="Not referenced locally, nor via imports">RuntimeCheck</span></span> = <a href="../signatures-namespaced.sdf3#StrategoLang-Type_158_175" id="StrategoLang-Type_657_674" title="Defined at ../signatures-namespaced.sdf3 line 7, 13, 14, 15, 16, 17, 18, 19, 20">StrategoLang-Type</a> { }
  <a href="#StrategoLang-SCoercion_1027_1049" id="StrategoLang-SCoercion_681_703" title="Referenced at line 28">StrategoLang-SCoercion</a>.<span class="cons_Constructor"><span id="SFail_704_709" title="Not referenced locally, nor via imports">SFail</span></span> = [<span class="cons_String">fail</span>] { }
  <a href="#StrategoLang-SCoercion_1027_1049" id="StrategoLang-SCoercion_725_747" title="Referenced at line 28">StrategoLang-SCoercion</a>.<span class="cons_Constructor"><span id="SId_748_751" title="Not referenced locally, nor via imports">SId</span></span> = [<span class="cons_String">id</span>] { }
  <a href="#StrategoLang-SCoercion_1027_1049" id="StrategoLang-SCoercion_765_787" title="Referenced at line 28">StrategoLang-SCoercion</a>.<span class="cons_Constructor"><span id="SRuntimeCheck_788_801" title="Not referenced locally, nor via imports">SRuntimeCheck</span></span> = <a href="../signatures-namespaced.sdf3#StrategoLang-SType_1384_1402" id="StrategoLang-SType_804_822" title="Defined at ../signatures-namespaced.sdf3 line 34, 38, 39">StrategoLang-SType</a> { }
  <a href="#StrategoLang-Strategy_1564_1585" id="StrategoLang-Strategy_829_850" title="Referenced at line 37">StrategoLang-Strategy</a> = <a href="#StrategoLang-Proxy_363_381" id="StrategoLang-Proxy_853_871" title="Defined at line 14, 27, 28">StrategoLang-Proxy</a> { }
  <a href="#StrategoLang-Proxy_853_871" id="StrategoLang-Proxy_878_896" title="Referenced at line 26">StrategoLang-Proxy</a>.<span class="cons_Constructor"><span id="Proxy_897_902" title="Not referenced locally, nor via imports">Proxy</span></span> = [<span class="cons_String">proxy(</span>[<a href="#StrategoLang-Coercion_318_339" id="StrategoLang-Coercion_913_934" title="Defined at line 14, 20, 21, 22">StrategoLang-Coercion</a>]<span class="cons_String">,</span> [<a href="#StrategoLang-Coercion_318_339" id="StrategoLang-Coercion_938_959" title="Defined at line 14, 20, 21, 22">StrategoLang-Coercion</a>]<span class="cons_String">)(</span>[<a href="#StrategoLang-SVar_1171_1188" id="StrategoLang-SVar_963_980" title="Defined at line 29">StrategoLang-SVar</a>]<span class="cons_String">)</span>] { }
  <a href="#StrategoLang-Proxy_853_871" id="StrategoLang-Proxy_990_1008" title="Referenced at line 26">StrategoLang-Proxy</a>.<span class="cons_Constructor"><span id="ProxyT_1009_1015" title="Not referenced locally, nor via imports">ProxyT</span></span> = [<span class="cons_String">proxy(</span>[{<a href="#StrategoLang-SCoercion_340_362" id="StrategoLang-SCoercion_1027_1049" title="Defined at line 14, 23, 24, 25">StrategoLang-SCoercion</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="#StrategoLang-Coercion_318_339" id="StrategoLang-Coercion_1062_1083" title="Defined at line 14, 20, 21, 22">StrategoLang-Coercion</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)(</span>[<a href="#StrategoLang-Coercion_318_339" id="StrategoLang-Coercion_1094_1115" title="Defined at line 14, 20, 21, 22">StrategoLang-Coercion</a>]<span class="cons_String">,</span> [<a href="#StrategoLang-Coercion_318_339" id="StrategoLang-Coercion_1119_1140" title="Defined at line 14, 20, 21, 22">StrategoLang-Coercion</a>]<span class="cons_String">)(</span>[<a href="#StrategoLang-SVar_1171_1188" id="StrategoLang-SVar_1144_1161" title="Defined at line 29">StrategoLang-SVar</a>]<span class="cons_String">)</span>] { }
  <a href="#StrategoLang-SVar_1144_1161" id="StrategoLang-SVar_1171_1188" title="Referenced at line 28">StrategoLang-SVar</a> = <span class="cons_Lit">"cast"</span> {<span class="keyword">reject</span>}

<span class="keyword">sorts</span> <span id="StrategoLang-TypedSVar_1214_1236" title="Not referenced locally, nor via imports">StrategoLang-TypedSVar</span> <span id="StrategoLang-TypedTVar_1237_1259" title="Not referenced locally, nor via imports">StrategoLang-TypedTVar</span>

<span class="keyword">context-free syntax</span>

  <span id="StrategoLang-StrategyDef_1284_1308" title="Not referenced locally, nor via imports">StrategoLang-StrategyDef</span>.<span class="cons_Constructor"><span id="ExtTypedDef_1309_1320" title="Not referenced locally, nor via imports">ExtTypedDef</span></span> = [<span class="cons_String">external</span> [<a href="../../core/strategies-namespaced.sdf3#StrategoLang-MaybeEmptySId_1149_1175" id="StrategoLang-MaybeEmptySId_1334_1360" title="Defined at ../../core/strategies-namespaced.sdf3 line 37, 38">StrategoLang-MaybeEmptySId</a>] <span class="cons_String">::</span> [<a href="../signatures-namespaced.sdf3#StrategoLang-FunTType_1453_1474" id="StrategoLang-FunTType_1366_1387" title="Defined at ../signatures-namespaced.sdf3 line 34, 45">StrategoLang-FunTType</a>]] { }
  <span id="StrategoLang-StrategyDef_1396_1420" title="Not referenced locally, nor via imports">StrategoLang-StrategyDef</span>.<span class="cons_Constructor"><span id="ExtTypedDefInl_1421_1435" title="Not referenced locally, nor via imports">ExtTypedDefInl</span></span> = [<span class="cons_String">external</span> [<a href="../../core/strategies-namespaced.sdf3#StrategoLang-MaybeEmptySId_1149_1175" id="StrategoLang-MaybeEmptySId_1449_1475" title="Defined at ../../core/strategies-namespaced.sdf3 line 37, 38">StrategoLang-MaybeEmptySId</a>]<span class="cons_String">(</span>[{<a href="../../core/terms-namespaced.sdf3#StrategoLang-ID_143_158" id="StrategoLang-ID_1479_1494" title="Defined at ../../core/terms-namespaced.sdf3 line 7, 12">StrategoLang-ID</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="../../core/terms-namespaced.sdf3#StrategoLang-ID_143_158" id="StrategoLang-ID_1507_1522" title="Defined at ../../core/terms-namespaced.sdf3 line 7, 12">StrategoLang-ID</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [<a href="../signatures-namespaced.sdf3#StrategoLang-FunTType_1453_1474" id="StrategoLang-FunTType_1536_1557" title="Defined at ../signatures-namespaced.sdf3 line 34, 45">StrategoLang-FunTType</a>] <span class="cons_String">=</span>
  [<a href="#StrategoLang-Strategy_406_427" id="StrategoLang-Strategy_1564_1585" title="Defined at line 18, 19, 26">StrategoLang-Strategy</a>]] { }

</code></pre></td></tr></tbody></table></div>