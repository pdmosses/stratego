---
title: signatures-namespaced.sdf3
hide:
  - toc
---

# `signatures-namespaced.sdf3`



[pdmosses/stratego/stratego.lang/src-gen/syntax/StrategoLang/sugar/signatures-namespaced.sdf3]: https://github.com/pdmosses/stratego/blob/master/stratego.lang/src-gen/syntax/StrategoLang/sugar/signatures-namespaced.sdf3 "The source file on GitHub"

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
</pre></div></td>
<td class="code"><pre><code><span class="keyword">module</span> <button class="modal-open" id="StrategoLang/sugar/signatures-namespaced_1_8" title="Multi-file references" data-urls="../main-namespaced.sdf3/#StrategoLang/sugar/signatures-namespaced_7_3 line 7; ../strategies-namespaced.sdf3/#StrategoLang/sugar/signatures-namespaced_11_3 line 11">StrategoLang/sugar/signatures-namespaced</button>

<span class="keyword">imports</span>
  <a href="../../core/signatures-namespaced.sdf3/#StrategoLang/core/signatures-namespaced_1_8" id="StrategoLang/core/signatures-namespaced_4_3" title="Defined at ../../core/signatures-namespaced.sdf3 line 1">StrategoLang/core/signatures-namespaced</a>        
  <a href="../constants-namespaced.sdf3/#StrategoLang/sugar/constants-namespaced_1_8" id="StrategoLang/sugar/constants-namespaced_5_3" title="Defined at ../constants-namespaced.sdf3 line 1">StrategoLang/sugar/constants-namespaced</a>        
  <a href="../../core/identifiers-namespaced.sdf3/#StrategoLang/core/identifiers-namespaced_1_8" id="StrategoLang/core/identifiers-namespaced_6_3" title="Defined at ../../core/identifiers-namespaced.sdf3 line 1">StrategoLang/core/identifiers-namespaced</a>

<span class="keyword">context-free syntax</span>

  <a href="#StrategoLang-Sort_10_36" id="StrategoLang-Sort_10_3" title="Referenced at line 10, 11, 12">StrategoLang-Sort</a>.<span class="cons_Constructor"><span id="SortList_10_21" title="Not referenced">SortList</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#StrategoLang-Sort_10_3" id="StrategoLang-Sort_10_36" title="Defined at line 10, 11, 12">StrategoLang-Sort</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">]</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had real meaning and will be dropped")}
  <a href="#StrategoLang-Sort_10_36" id="StrategoLang-Sort_11_3" title="Referenced at line 10, 11, 12">StrategoLang-Sort</a>.<span class="cons_Constructor"><span id="SortListTl_11_21" title="Not referenced">SortListTl</span></span> = &lt;<span class="cons_String">[</span>&lt;{<a href="#StrategoLang-Sort_10_3" id="StrategoLang-Sort_11_38" title="Defined at line 10, 11, 12">StrategoLang-Sort</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">|</span> &lt;<a href="#StrategoLang-Sort_10_3" id="StrategoLang-Sort_11_67" title="Defined at line 10, 11, 12">StrategoLang-Sort</a>&gt; <span class="cons_String">]</span>&gt; {<span class="keyword">deprecated</span>("This syntax never had real meaning and will be dropped")}
  <a href="#StrategoLang-Sort_10_36" id="StrategoLang-Sort_12_3" title="Referenced at line 10, 11, 12">StrategoLang-Sort</a>.<span class="cons_Constructor"><span id="SortTuple_12_21" title="Not referenced">SortTuple</span></span> = &lt;<span class="cons_String">(</span>&lt;{<a href="#StrategoLang-Sort_10_3" id="StrategoLang-Sort_12_37" title="Defined at line 10, 11, 12">StrategoLang-Sort</a> <span class="cons_Lit">", "</span>}*&gt; <span class="cons_String">)</span>&gt; {<span class="keyword">deprecated</span>("This syntax is being replaced")}

</code></pre></td></tr></tbody></table></div>

<div id="modal">
  <div id="modal-content">
    <span id="modal-close">&times;</span>
    <h2 id="modal-h2"></h2>
    <p  id="modal-p"></p>
    <ul id="modal-ul"></ul>
  </div>
</div>
