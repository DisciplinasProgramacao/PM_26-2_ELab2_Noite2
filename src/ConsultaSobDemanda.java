import java.time.LocalDateTime;

/** 
 * MIT License
 *
 * Copyright(c) 2026 João Caram <caram@pucminas.br>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 * 
 * @author João Caram @joaocaram (caram@pucminas.br)
 * Uso do @Copilot para gerar a base da documentação (revisada manualmente)
 */

/**
 * Representa uma consulta sob demanda (atendimento imediato).
 *
 * @see Consulta
 * @see EEspecialidade
 */
public class ConsultaSobDemanda extends Consulta {

	/** Percentual de adicional aplicado ao valor base da consulta (10%). */
	private static final double PCT_ADICIONAL = 0.10;

	/**
	 * Cria uma consulta sob demanda para o paciente informado.
	 * <p>
	 * O horário da consulta é definido como {@link LocalDateTime#now()}.
	 * </p>
	 *
	 * @param paciente nome do paciente
	 * @param espec especialidade médica da consulta
	 */
	public ConsultaSobDemanda(String paciente, EEspecialidade espec) {
		super(paciente, LocalDateTime.now(), espec);
	}

	/**
	 * Calcula o valor da consulta sob demanda.
	 * <p>
	 * O valor corresponde ao valor base da especialidade acrescido do
	 * percentual definido em {@code PCT_ADICIONAL}.
	 * </p>
	 *
	 * @return valor final da consulta sob demanda
	 */
	public double valorConsulta() {
		return  especialidade.valor() * (1 + PCT_ADICIONAL);
	}

}