package br.com.dashwork.application.api.dto;
import java.util.List;
import java.util.stream.Collectors;
import br.com.dashwork.application.api.domain.Cliente;
import lombok.Getter;
@Getter
public class ClienteDTO {
	private Long id;
	private String nome;
	private String telefone;

	public ClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		this.telefone = cliente.getTelefone();
	}
	
	public static List<ClienteDTO> parseListDTO(List<Cliente> listaCliente) {
		return listaCliente.stream().map(ClienteDTO::new).collect(Collectors.toList());
	}
}