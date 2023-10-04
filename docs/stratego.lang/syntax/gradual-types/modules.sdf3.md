---
title: modules.sdf3
hide:
  - toc
---

# `modules.sdf3`

:simple-github: [pdmosses/stratego/stratego.lang/syntax/gradual-types/modules.sdf3]

[pdmosses/stratego/stratego.lang/syntax/gradual-types/modules.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/syntax/gradual-types/modules.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <a href="../main.sdf3#gradual-types/modules_37_58" id="gradual-types/modules_7_28" title="Referenced at ../main.sdf3 line 4">gradual-types/modules</a>
<span class="keyword">imports</span>
  <a href="../../core/identifiers.sdf3#core/identifiers_7_23" id="core/identifiers_39_55" title="Defined at ../../core/identifiers.sdf3 line 1">core/identifiers</a>
  <a href="../../core/strategies.sdf3#core/strategies_7_22" id="core/strategies_58_73" title="Defined at ../../core/strategies.sdf3 line 1">core/strategies</a>
  <a href="../signatures.sdf3#gradual-types/signatures_7_31" id="gradual-types/signatures_76_100" title="Defined at ../signatures.sdf3 line 1">gradual-types/signatures</a>

<span class="keyword">context-free syntax</span>

  <span id="Def_125_128" title="Not referenced locally, nor via imports">Def</span>.<span class="cons_Constructor"><span id="DefHasTypeNoArgs_129_145" title="Not referenced locally, nor via imports">DefHasTypeNoArgs</span></span> = [[<a href="../../core/strategies.sdf3#SId_686_689" id="SId_150_153" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>] <span class="cons_String">::</span> [<a href="../signatures.sdf3#SSimpleFunType_853_867" id="SSimpleFunType_159_173" title="Defined at ../signatures.sdf3 line 32, 37, 38">SSimpleFunType</a>]]
  <span id="Def_178_181" title="Not referenced locally, nor via imports">Def</span>.<span class="cons_Constructor"><span id="DefHasType_182_192" title="Not referenced locally, nor via imports">DefHasType</span></span>       = [[<a href="../../core/strategies.sdf3#SId_686_689" id="SId_203_206" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>]<span class="cons_String">(</span>[{<a href="../signatures.sdf3#SType_838_843" id="SType_210_215" title="Defined at ../signatures.sdf3 line 32, 34, 35">SType</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [<a href="../signatures.sdf3#SSimpleFunType_853_867" id="SSimpleFunType_229_243" title="Defined at ../signatures.sdf3 line 32, 37, 38">SSimpleFunType</a>]]
  <span id="Def_248_251" title="Not referenced locally, nor via imports">Def</span>.<span class="cons_Constructor"><span id="DefHasTType_252_263" title="Not referenced locally, nor via imports">DefHasTType</span></span>      = [[<a href="../../core/strategies.sdf3#SId_686_689" id="SId_273_276" title="Defined at ../../core/strategies.sdf3 line 34, 37">SId</a>]<span class="cons_String">(</span>[{<a href="../signatures.sdf3#SType_838_843" id="SType_280_285" title="Defined at ../signatures.sdf3 line 32, 34, 35">SType</a> <span class="cons_Lit">", "</span>}*] <span class="cons_String">|</span> [{<a href="../signatures.sdf3#Type_98_102" id="Type_298_302" title="Defined at ../signatures.sdf3 line 7, 11, 12, 13, 14, 15, 16, 17, 18">Type</a> <span class="cons_Lit">", "</span>}*]<span class="cons_String">)</span> <span class="cons_String">::</span> [<a href="../signatures.sdf3#SSimpleFunType_853_867" id="SSimpleFunType_316_330" title="Defined at ../signatures.sdf3 line 32, 37, 38">SSimpleFunType</a>]]
</code></pre></td></tr></tbody></table></div>